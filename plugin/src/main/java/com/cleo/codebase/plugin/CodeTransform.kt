package com.cleo.codebase.plugin

import com.android.build.gradle.AppExtension
import com.cleo.codebase.plugin.cv.LambdaClassVisitor
import com.qihoo360.replugin.transform.AbstractTransform
import com.qihoo360.replugin.transform.bean.InstrumentationContext
import com.qihoo360.replugin.transform.bean.TransformClassInfo
import org.objectweb.asm.ClassVisitor

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:14:41
 * email:gaoguanling@360.cn
 * link:
 */
open class CodeTransform(appExtension: AppExtension, override val extension: CodeBaseExtension) :
    AbstractTransform(appExtension, extension) {

    override fun isIncremental(): Boolean = true
    override fun isExcludeClass(classInfo: TransformClassInfo): Boolean {
        extension.excludedClasses?.forEach { excludeClass ->
            if (classInfo.fromJar == excludeClass.fromJar
                && classInfo.content.scopes.contains(excludeClass.getScopeByValue())
            ) {
                excludeClass.classNameRegex.forEach { regex ->
                    if (Regex(regex).matches(classInfo.name)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    override fun isSkipClass(classInfo: TransformClassInfo): Boolean {
        extension.skipClasses?.forEach { skipClass ->
            if (classInfo.fromJar == skipClass.fromJar
                && classInfo.content.scopes.contains(skipClass.getScopeByValue())
            ) {
                skipClass.classNameRegex.forEach { regex ->
                    if (Regex(regex).matches(classInfo.name)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    override fun transformVisitor(visitor: ClassVisitor, context: InstrumentationContext): ClassVisitor {
        return LambdaClassVisitor(visitor, context)
    }
}