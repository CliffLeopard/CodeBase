package com.cleo.codebase.event

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import com.cleo.codebase.databinding.ActivityTouchEventBinding

class TouchEventActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTouchEventBinding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTouchEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.outer1.setOnTouchListener { _, _ ->
            Log.e("GGL", "outer1 touch")
            false
        }

        binding.outer2.setOnTouchListener { _, _ ->
            Log.e("GGL", "outer2 touch")
            true
        }

        binding.btn.setOnClickListener{
            Log.e("GGL", "btn touch")
        }
    }
}