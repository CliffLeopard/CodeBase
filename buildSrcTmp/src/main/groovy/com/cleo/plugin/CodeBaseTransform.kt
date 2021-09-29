package com.cleo.plugin

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:11:13
 * email:gaoguanling@360.cn
 * link:
 */
class CodeBaseTransform : Transform() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> {
        TODO("Not yet implemented")
    }

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> {
        TODO("Not yet implemented")
    }

    override fun isIncremental(): Boolean {
        TODO("Not yet implemented")
    }
}