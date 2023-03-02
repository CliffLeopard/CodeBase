package com.cleo.codebase.webview

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.util.Log
import android.webkit.WebView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * author:CliffLeopard
 * date:2023/3/2
 * time:10:52
 * email:precipiceleopard@gmail.com
 * link:
 */
object CaptureHelper {
    private val bitmaps = mutableListOf<Bitmap>()
    fun capture(scope: CoroutineScope, wv: WebView, scale: Float) {
        scrollCapture(scope, wv)
    }

    private fun scrollCapture(scope: CoroutineScope, wv: WebView) {
        scope.launch {
            // 一页页滑动，并截取图片
            wv.pageUp(true)
            var captureSize = 0
            do {
                delay(1000)
                val rect = Rect()
                wv.getLocalVisibleRect(rect)
                val bitmap = Bitmap.createBitmap(wv.width, rect.top + wv.height, Bitmap.Config.ARGB_8888)
                wv.draw(Canvas(bitmap))
                val newBitmap = Bitmap.createBitmap(bitmap, 0, rect.top, wv.width, wv.height)
                bitmaps.add(newBitmap)
                if (!bitmap.isRecycled) {
                    bitmap.recycle()
                }
                captureSize += 1
            } while (wv.pageDown(false) && captureSize < 5)

            // 图片拼接
            bitmaps.subList(1, bitmaps.size - 1).forEach {
                val first = bitmaps[0]
                val width = first.width.coerceAtLeast(it.width)
                val height = first.height + it.height
                val newBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                val canvas = Canvas(newBitmap)
                canvas.drawBitmap(first, 0f, 0f, null)
                canvas.drawBitmap(it, 0f, first.height.toFloat(), null);
                bitmaps[0] = newBitmap
                if (!it.isRecycled) {
                    it.recycle()
                }
            }
            Log.e("CaptureHelper", "截取图片张数: ${bitmaps.size}")
        }
    }
}