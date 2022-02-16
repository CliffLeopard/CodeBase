package com.cleo.codebase.plugin

import com.android.build.gradle.AppExtension
import com.qihoo360.replugin.AbstractPlugin
import com.qihoo360.replugin.hook.HookLambda
import com.qihoo360.replugin.hook.HookMethod
import com.qihoo360.replugin.hook.TargetClass
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
    }

    override fun configExtension(project: Project, android: AppExtension) {
        super.configExtension(project, android)
        extension?.excludedClasses = project.container(TargetClass::class.java)
        extension?.skipClasses = project.container(TargetClass::class.java)
        extension?.hookMethods = project.container(HookMethod::class.java)
        extension?.hookLambdas = project.container(HookLambda::class.java)
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