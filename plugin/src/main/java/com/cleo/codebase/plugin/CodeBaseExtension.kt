package com.cleo.codebase.plugin

import com.qihoo360.replugin.config.BaseExtension
import com.qihoo360.replugin.hook.HookLambda
import com.qihoo360.replugin.hook.HookMethod
import com.qihoo360.replugin.hook.TargetClass
import groovy.lang.Closure
import org.gradle.api.NamedDomainObjectContainer

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:11:02
 * email:gaoguanling@360.cn
 * link:
 */
open class CodeBaseExtension : BaseExtension() {
    open var skipClasses: NamedDomainObjectContainer<TargetClass>? = null
    open var excludedClasses: NamedDomainObjectContainer<TargetClass>? = null
    open var hookMethods: NamedDomainObjectContainer<HookMethod>? = null
    open var hookLambdas: NamedDomainObjectContainer<HookLambda>? = null
    open val defaultHookMethod: Set<HookMethod> = setOf()
    open val defaultHookLambda: Set<HookLambda> = setOf()

    fun excludedClasses(closure: Closure<TargetClass>) {
        this.excludedClasses?.configure(closure)
    }

    fun skipClasses(closure: Closure<TargetClass>) {
        this.skipClasses?.configure(closure)
    }

    fun hookMethods(closure: Closure<HookMethod>) {
        this.hookMethods?.configure(closure)
    }

    fun hookLambdas(closure: Closure<HookLambda>) {
        this.hookLambdas?.configure(closure)
    }
}