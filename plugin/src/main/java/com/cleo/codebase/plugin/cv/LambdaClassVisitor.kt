package com.cleo.codebase.plugin.cv

import com.qihoo360.replugin.transform.visitor.InstrumentationContext
import com.qihoo360.replugin.transform.visitor.PluginClassVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:11:19
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaClassVisitor(cv: ClassVisitor, context: InstrumentationContext) :
    PluginClassVisitor(cv, context) {

    override fun visit(
        version: Int,
        access: Int,
        name: String?,
        signature: String?,
        superName: String?,
        interfaces: Array<out String>?
    ) {
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitMethod(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        val originMv = super.visitMethod(access, name, descriptor, signature, exceptions)
        return if (context.classInfo.name.contains("com/cleo/codebase/cases/"))
            LambdaMethodVisitor(
                this,
                context,
                originMv,
                access,
                name,
                descriptor
            )
        else
            originMv
    }

}