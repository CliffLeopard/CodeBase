package com.cleo.codebase.plugin.cv

import com.cleo.codebase.plugin.Log
import com.qihoo360.replugin.config.BaseExtension
import com.qihoo360.replugin.transform.bean.InstrumentationContext
import com.qihoo360.replugin.transform.bean.TransformClassInfo
import com.qihoo360.replugin.transform.visitor.FilterClassVisitor
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter

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
//        val verifierVisitor = CheckClassAdapter(classWriter)
        val lambdaClassVisitor = LambdaClassVisitor(classWriter, context)
        classReader.accept(
            lambdaClassVisitor,
            ClassReader.EXPAND_FRAMES or ClassReader.SKIP_FRAMES
        )
        return if (context.classModified) {
            Log.i(
                tag,
                "ChangedClass:\n" +
                        "class:${context.classInfo.name}\n" +
                        "fromJar:${context.classInfo.fromJar}\n" +
                        "toPath:${context.classInfo.toPath}\n" +
                        "thread:${Thread.currentThread().name}"
            )
            classWriter.toByteArray()
        } else {
            Log.i(
                tag,
                "NotChangedClass:\n" +
                        "thread:${Thread.currentThread().name}"
            )
            null
        }

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