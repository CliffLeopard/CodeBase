package com.cleo.codebase.coroutine.channel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.cleo.codebase.databinding.ActivityChannelBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.onSuccess
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChannelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChannelBinding
    private val outChanel = Channel<Int>()
    private var valueNow = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChannelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAction()

        lifecycleScope.launch {
            for (y in outChanel) println("outChannel: received: $y")
            println("out received finished")
        }
    }

    fun initAction() {
        binding.normalCase.setOnClickListener {
            normalChannel()
        }
        binding.closeCase.setOnClickListener {
            closeCase()
        }

        binding.sendCase.setOnClickListener {
            lifecycleScope.launch {
                Log.e("GGL", "lifecycleScope thread:${Thread.currentThread()}")
                outChanel.trySend(valueNow).onSuccess {
                    Log.e("GGL", "send  success thread:${Thread.currentThread()}")
                    valueNow++
                }
            }
        }

        binding.sendFinish.setOnClickListener {
            lifecycleScope.launch {
                outChanel.close()
            }
        }

        binding.producerCase.setOnClickListener {
            producer()
        }
    }

    private fun normalChannel() {
        lifecycleScope.launch {
            val channel = Channel<Int>()
            launch {
                for (x in 1..5) channel.trySend(x * x)
            }
            repeat(5) {
                Log.e("Channel", "receive: ${channel.receive()}")
            }
            Log.e("Channel", "Done")
        }
        Log.e("Channel", "finish onCLick")
    }

    private fun closeCase() {
        lifecycleScope.launch {
            val channel = Channel<Int>()
            launch {
                for (x in 1..5) channel.trySend(x * x)
                channel.close() // 我们结束发送
            }
            for (y in channel) println(y)
            println("Done!")
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun producer() {
        lifecycleScope.launch {
            val squares = produce {
                for (x in 1..5) send(x * x)
            }
            squares.consumeEach { println(it) }
            println("Done!")
        }
    }
}