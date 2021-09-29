package com.cleo.codebase.plugin

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.gradle.internal.pipeline.TransformManager

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:14:41
 * email:gaoguanling@360.cn
 * link:
 */
class CodeTransform : Transform() {
    override fun getName(): String = CodeConstants.pluginName

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> {
        return TransformManager.CONTENT_CLASS
    }

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    override fun isIncremental(): Boolean {
        return true
    }
}