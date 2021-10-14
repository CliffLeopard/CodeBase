package com.cleo.codebase.plugin.cv

import com.qihoo360.replugin.transform.visitor.InstrumentationContext
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

    private val wrappedHandles = mutableSetOf<Handle>()
    private val codeBaseHandleTail = "CodeWrapImpl"
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
        constant.classModified = true
        val methodType: Type = bootstrapMethodArguments[0] as Type
        val handle: Handle = bootstrapMethodArguments[1] as Handle
        val changedHandle = Handle(
            handle.tag,
            handle.owner,
            handle.name + codeBaseHandleTail,
            handle.desc,
            handle.isInterface
        )

        if (changedHandle.owner == constant.classInfo.name) {
            wrappedHandles.add(changedHandle)
        }
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
            val handle = iterator.next()
            var access = Opcodes.ACC_PRIVATE or Opcodes.ACC_FINAL
            if (handle.tag == Opcodes.H_INVOKESTATIC) {
                access = access or Opcodes.ACC_STATIC
            }

            val originVisitor = classVisitor.visitMethod(
                access,
                handle.name,
                handle.desc,
                null,
                null
            )

            val createMethodVisitor = LambdaMethodVisitor(
                classVisitor, constant,
                originVisitor,
                Opcodes.ACC_PRIVATE or Opcodes.ACC_FINAL,
                handle.name,
                handle.desc
            )
            createMethodVisitor.visitCode()
            val label0 = Label()
            createMethodVisitor.visitLabel(label0)


            // visitBefore
            createMethodVisitor.visitFieldInsn(
                Opcodes.GETSTATIC,
                "com/cleo/codebase/WrapperCenter",
                "INSTANCE",
                "Lcom/cleo/codebase/WrapperCenter;"
            )
            createMethodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
            createMethodVisitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "com/cleo/codebase/WrapperCenter",
                "wrapOnClickBefore",
                "(Landroid/view/View;)V",
                false
            )


            // visitMethod
            if (handle.tag == Opcodes.H_INVOKESTATIC) {
                val staticMethod = handle.owner.split('$')
                createMethodVisitor.visitFieldInsn(
                    Opcodes.GETSTATIC,
                    staticMethod[0],
                    staticMethod[1],
                    "L${staticMethod[0]}\$${staticMethod[1]};"
                )
                createMethodVisitor.visitVarInsn(ALOAD, 1)
                createMethodVisitor.visitMethodInsn(
                    Opcodes.INVOKESTATIC,
                    handle.owner,
                    handle.name.removeSuffix(codeBaseHandleTail),
                    handle.desc,
                    handle.isInterface
                )
            } else {
                createMethodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
                createMethodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
                createMethodVisitor.visitMethodInsn(
                    Opcodes.INVOKESPECIAL,
                    handle.owner,
                    handle.name.removeSuffix(codeBaseHandleTail),
                    handle.desc,
                    handle.isInterface
                )
            }

            // visitAfter
            createMethodVisitor.visitFieldInsn(
                Opcodes.GETSTATIC,
                "com/cleo/codebase/WrapperCenter",
                "INSTANCE",
                "Lcom/cleo/codebase/WrapperCenter;"
            )
            createMethodVisitor.visitVarInsn(Opcodes.ALOAD, 1)
            createMethodVisitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "com/cleo/codebase/WrapperCenter",
                "wrapOnClickAfter",
                "(Landroid/view/View;)V",
                false
            )
            createMethodVisitor.visitInsn(Opcodes.RETURN)

            val label4 = Label()
            createMethodVisitor.visitLabel(label4)
            createMethodVisitor.visitLocalVariable(
                "this",
                "L$owner+;",
                null,
                label0,
                label4,
                0
            )
            createMethodVisitor.visitLocalVariable(
                "view",
                "Landroid/view/View;",
                null,
                label0,
                label4,
                1
            )
            createMethodVisitor.visitMaxs(2, 2)
            createMethodVisitor.visitEnd()
        }
    }
}