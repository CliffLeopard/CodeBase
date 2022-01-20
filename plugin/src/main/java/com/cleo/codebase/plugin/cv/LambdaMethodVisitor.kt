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
    private var owner: String = ""

    override fun visitMethodInsn(
        opcode: Int,
        owner: String?,
        name: String?,
        descriptor: String?,
        isInterface: Boolean
    ) {
        this.owner = owner!!
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
        val changedHandle = Handle(
            handle.tag,
            handle.owner,
            getTargetMethodName(handle.owner, handle.name),
            handle.desc,
            handle.isInterface
        )
        wrappedHandles.add(ChangeState(handle, changedHandle))

        println("visitInvokeDynamicInsn:\nname:$name \ndescriptor:$descriptor\nmethodType:$methodType ")
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
            val changedHandle = state.changedHandle
            val originHandle = state.originHandle

            println("originHandler: name:${originHandle.name}")

            val methodVisitor = classVisitor.visitMethod(Opcodes.ACC_PRIVATE or Opcodes.ACC_FINAL, changedHandle.name, changedHandle.desc, null, null)
            println("Begin createMethod: owner:${originHandle.owner} originName:${originHandle.name} createName:${changedHandle.name}")

            methodVisitor.visitCode()
            val label0 = Label()
            methodVisitor.visitLabel(label0)
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
            methodVisitor.visitMethodInsn(
                Opcodes.INVOKESTATIC,
                "com/cleo/codebase/WrapperCenter",
                "wrapOnClickBefore",
                "(Landroid/view/View;)V",
                false
            )
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
            methodVisitor.visitMethodInsn(
                Opcodes.INVOKESPECIAL,
                originHandle.owner,
                originHandle.name,
                originHandle.desc,
                originHandle.isInterface
            )
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
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
            methodVisitor.visitLocalVariable("this", "L${changedHandle.owner};", null, label0, label1, 0)
            val arguments = Type.getType(changedHandle.desc).argumentTypes
            arguments.forEachIndexed { index, arg ->
                println("visitLocalVariable:${arg.descriptor} index:${index}")
                methodVisitor.visitLocalVariable("var$index", arg.descriptor, null, label0, label1, 1 + index)
            }

            methodVisitor.visitMaxs(2, 2)
            methodVisitor.visitEnd()
        }
    }

    data class ChangeState(val originHandle: Handle, val changedHandle: Handle)
    companion object {
        private const val codeBaseHandleTail = "CodeWrapImpl"
        fun getTargetMethodName(owner: String, name: String): String {
            return owner.replace('/', 'I') + name + codeBaseHandleTail
        }
    }
}