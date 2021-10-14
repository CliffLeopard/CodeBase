package com.cleo.codebase.plugin.cv

import com.cleo.codebase.plugin.Log
import com.qihoo360.replugin.config.BaseExtension
import com.qihoo360.replugin.transform.bean.TransformClassInfo
import com.qihoo360.replugin.transform.visitor.FilterClassVisitor
import com.qihoo360.replugin.transform.visitor.InstrumentationContext
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.util.CheckClassAdapter

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:11:17
 * email:gaoguanling@360.cn
 * link:
 */
object CodeClassReWriter {
    private const val tag = "CodeClassReWriter"
    fun transform(
        classInfo: TransformClassInfo,
        inputBytes: ByteArray,
        extension: BaseExtension
    ): ByteArray? {

        val context = InstrumentationContext(classInfo, extension)
        val classReader = ClassReader(inputBytes)
        val classWriter = ClassWriter(classReader, ClassWriter.COMPUTE_MAXS)

        filerClass(context)
        if (context.skipClass) {
            Log.detail(tag, "Skip: ${classInfo.name}")
            return null
        }
        val verifierVisitor = CheckClassAdapter(classWriter)
        val lambdaClassVisitor = LambdaClassVisitor(verifierVisitor, context)
        classReader.accept(
            lambdaClassVisitor,
            ClassReader.SKIP_FRAMES or ClassReader.EXPAND_FRAMES
        )
        if (context.classInfo.name.contains("com/cleo/codebase/cases"))
            Log.i(tag, "${context.classInfo.name} is modified: ${context.classModified}")

        return if (context.classModified) {
            Log.i(
                tag,
                "ChangedClass:\n      class:${context.classInfo.name}\n      fromJar:${context.classInfo.fromJar}\n      toPath:${context.classInfo.toPath}"
            )
            classWriter.toByteArray()
        } else
            null
    }

    private fun filerClass(context: InstrumentationContext) {
        if (context.extension.isTargetClass(context.classInfo.name))
            context.skipClass = true
    }

    /**
     * 由于我们业务比较简单，不需要使用这种方式过滤，打出接口以后使用
     */
    private fun filerClassByReader(classReader: ClassReader, context: InstrumentationContext) {
        classReader.accept(
            FilterClassVisitor(context),
            ClassReader.SKIP_DEBUG or ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES
        )
    }
}