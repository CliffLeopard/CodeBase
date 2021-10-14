package com.cleo.codebase.plugin

import com.android.build.gradle.AppExtension
import com.qihoo360.replugin.AbstractPlugin
import com.qihoo360.replugin.transform.AbstractTransform
import org.gradle.api.Project

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:14:40
 * email:gaoguanling@360.cn
 * link:
 */
open class CodeBasePlugin : AbstractPlugin<CodeBaseExtension>() {
    override fun createExtension(project: Project) {
        project.extensions.create(CodeConstants.pluginConfig, CodeBaseExtension::class.java)
    }

    override fun initExtension(project: Project, android: AppExtension) {
        extension = project.extensions.getByName(CodeConstants.pluginConfig) as CodeBaseExtension
        if (extension == null)
            throw Exception("请在build.gradle 文件中配置 codeConfig!!")
        else
            extension!!.applicationId = android.defaultConfig.applicationId
    }

    override fun registerProjectTask(
        project: Project,
        android: AppExtension,
        extension: CodeBaseExtension
    ) {

    }

    override fun getTransform(project: Project, android: AppExtension): AbstractTransform? {
        return CodeTransform(android, extension!!)
    }
}