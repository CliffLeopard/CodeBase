package com.cleo.codebase.plugin

import com.android.build.gradle.AppExtension
import com.cleo.codebase.plugin.cv.CodeClassReWriter
import com.qihoo360.replugin.config.BaseExtension
import com.qihoo360.replugin.transform.AbstractTransform
import com.qihoo360.replugin.transform.bean.TransformClassInfo

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:14:41
 * email:gaoguanling@360.cn
 * link:
 */
open class CodeTransform(appExtension: AppExtension, extension: BaseExtension) :
    AbstractTransform(appExtension, extension) {

    override fun isIncremental(): Boolean {
        return true
    }

    override fun transformClass(classInfo: TransformClassInfo, inputBytes: ByteArray): ByteArray? {
        return CodeClassReWriter.transform(classInfo, inputBytes, extension)
    }
}