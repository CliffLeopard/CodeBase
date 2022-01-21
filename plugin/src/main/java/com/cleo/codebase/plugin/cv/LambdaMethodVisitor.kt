package com.cleo.codebase.plugin.cv

import com.qihoo360.replugin.transform.bean.InstrumentationContext
import org.objectweb.asm.*
import org.objectweb.asm.commons.AdviceAdapter


/**
 * author:gaoguanling
 * date:2021/9/30
 * time:11:22
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaMethodVisitor(
    private val classVisitor: ClassVisitor,
    private val constant: InstrumentationContext,
    methodVisitor: MethodVisitor,
    access: Int,
    name: String?,
    descriptor: String?
) : AdviceAdapter(Opcodes.ASM9, methodVisitor, access, name, descriptor) {

    private val wrappedHandles = mutableSetOf<ChangeState>()
    private val owner: String = constant.classInfo.name

    override fun visitMethodInsn(
        opcode: Int,
        owner: String?,
        name: String?,
        descriptor: String?,
        isInterface: Boolean
    ) {
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
    }

    override fun visitInvokeDynamicInsn(
        name: String?,
        descriptor: String?,
        bootstrapMethodHandle: Handle?,
        vararg bootstrapMethodArguments: Any?
    ) {
        val methodType: Type = bootstrapMethodArguments[0] as Type
        val handle: Handle = bootstrapMethodArguments[1] as Handle
        constant.classModified = true
        var desc = handle.desc
        var tag = handle.tag
        if (handle.owner != owner) {
            tag = Opcodes.H_INVOKESTATIC
            if (handle.tag != Opcodes.H_INVOKESTATIC) {
                desc = "(L${handle.owner};${handle.desc.removePrefix("(")}"
            }
        }
        val changedHandle = Handle(
            tag,
            owner,
            getTargetMethodName(handle.name),
            desc,
            handle.isInterface
        )
        wrappedHandles.add(ChangeState(changedHandle, handle.tag, handle.name, handle.owner, handle.desc))
        super.visitInvokeDynamicInsn(
            name,
            descriptor,
            bootstrapMethodHandle,
            methodType,
            changedHandle,
            methodType
        )
    }

    override fun visitEnd() {
        super.visitEnd()
        createMethod(classVisitor)
    }

    private fun createMethod(classVisitor: ClassVisitor) {
        val iterator = wrappedHandles.iterator()
        while (iterator.hasNext()) {
            val state = iterator.next()
            val handle = state.handle

            val isStatic = handle.tag == Opcodes.H_INVOKESTATIC
            val hasOtherObj = handle.desc != state.originDesc
            val access = Opcodes.ACC_PRIVATE or Opcodes.ACC_SYNTHETIC or (if (isStatic) Opcodes.ACC_STATIC else Opcodes.ACC_FINAL)
            val methodVisitor = classVisitor.visitMethod(access, handle.name, handle.desc, null, null)
            methodVisitor.visitCode()
            val label0 = Label()
            methodVisitor.visitLabel(label0)

            val preIndex = if (isStatic && !hasOtherObj) 0 else 1   // 正式参数开始位置
            val localIndex = if (isStatic) 0 else 1
            val arguments = Type.getType(handle.desc).argumentTypes
            val argLength = if (hasOtherObj) arguments.size - 1 else arguments.size // 正式参数长度

            // 调用WrapBefore方法
            for (i in 0 until argLength)
                methodVisitor.visitVarInsn(Opcodes.ALOAD, preIndex + i)
            methodVisitor.visitMethodInsn(
                Opcodes.INVOKESTATIC,
                "com/cleo/codebase/WrapperCenter",
                "wrapOnClickBefore",
                "(Landroid/view/View;)V",
                false
            )


            // 调用原方法
            if (!isStatic)
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
            for (index in arguments.indices) {
                methodVisitor.visitVarInsn(Opcodes.ALOAD, index + localIndex)
            }
            val originAccess = when (state.originTag) {
                Opcodes.H_INVOKESTATIC -> Opcodes.INVOKESTATIC
                Opcodes.H_INVOKEVIRTUAL -> Opcodes.INVOKEVIRTUAL
                Opcodes.H_INVOKESPECIAL -> Opcodes.INVOKESPECIAL
                Opcodes.H_INVOKEINTERFACE -> Opcodes.INVOKEINTERFACE
                else -> {
                    Opcodes.INVOKESTATIC
                }
            }
            methodVisitor.visitMethodInsn(
                originAccess,
                state.originOwner,
                state.originName,
                state.originDesc,
                handle.isInterface
            )

            // 调用WrapAfter方法
            for (i in 0 until argLength)
                methodVisitor.visitVarInsn(Opcodes.ALOAD, preIndex + i)
            methodVisitor.visitMethodInsn(
                Opcodes.INVOKESTATIC,
                "com/cleo/codebase/WrapperCenter",
                "wrapOnClickAfter",
                "(Landroid/view/View;)V",
                false
            )

            methodVisitor.visitInsn(Opcodes.RETURN)
            val label1 = Label()
            methodVisitor.visitLabel(label1)

            if (!isStatic) {
                methodVisitor.visitLocalVariable("this", "L${handle.owner};", null, label0, label1, 0)
            }
            arguments.forEachIndexed { index, arg ->
                methodVisitor.visitLocalVariable("var$index", arg.descriptor, null, label0, label1, localIndex + index)
            }

            val maxLocals = arguments.size + localIndex
            val maxStack = maxLocals + 1

            println("owner:${handle.owner} name:${handle.name} maxLocals:$maxLocals  maxStack:$maxStack")
            methodVisitor.visitMaxs(maxStack, maxLocals)
            methodVisitor.visitEnd()
        }
    }

    data class ChangeState(val handle: Handle, val originTag: Int, val originName: String, val originOwner: String, val originDesc: String)
    companion object {
        private const val codeBaseHandleTail = "CodeWrapImpl"
        fun getTargetMethodName(name: String): String {
            return "$name$$codeBaseHandleTail"
        }
    }
}