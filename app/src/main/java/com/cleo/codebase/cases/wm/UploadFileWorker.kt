package com.cleo.codebase.cases.wm

import android.content.Context
import android.text.TextUtils
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * author:gaoguanling
 * date:2021/9/28
 * time:18:27
 * email:gaoguanling@360.cn
 * link:
 */
class UploadFileWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {
    override fun doWork(): Result {
        val filePath = inputData.getString("file")
        val fileUrl = "" //FileUploadManager.upload(filePath)
        return if (TextUtils.isEmpty(fileUrl)) {
            Result.failure();
        } else {
            val outputData = Data.Builder().putString("fileUrl", fileUrl).build()
            Result.success(outputData);
        }
    }
}