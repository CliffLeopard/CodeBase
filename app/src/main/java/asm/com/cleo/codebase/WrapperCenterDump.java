package asm.com.cleo.codebase;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class WrapperCenterDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/cleo/codebase/WrapperCenter", null, "java/lang/Object", null);

        classWriter.visitSource("WrapperCenter.kt", null);

        {
            annotationVisitor0 = classWriter.visitAnnotation("Lkotlin/Metadata;", true);
            annotationVisitor0.visit("mv", new int[]{1, 6, 0});
            annotationVisitor0.visit("k", new Integer(1));
            annotationVisitor0.visit("xi", new Integer(48));
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d1");
                annotationVisitor1.visit(null, "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0009");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d2");
                annotationVisitor1.visit(null, "Lcom/cleo/codebase/WrapperCenter;");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "()V");
                annotationVisitor1.visit(null, "doNothing");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "view");
                annotationVisitor1.visit(null, "Landroid/view/View;");
                annotationVisitor1.visit(null, "wrapOnClickAfter");
                annotationVisitor1.visit(null, "wrapOnClickBefore");
                annotationVisitor1.visit(null, "app_debug");
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visitEnd();
        }
        {
            fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lcom/cleo/codebase/WrapperCenter;", null, null);
            {
                annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            fieldVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(14, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/WrapperCenter;", null, label0, label1, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "wrapOnClickBefore", "(Landroid/view/View;)V", null, null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("view");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(17, label1);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("wrapOnClickBefore");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(18, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label3, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "wrapOnClickAfter", "(Landroid/view/View;)V", null, null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("view");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(22, label1);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("wrapOnClickAfter");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(23, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label3, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "doNothing", "(Landroid/view/View;)V", null, null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("view");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(28, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            methodVisitor.visitCode();
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/WrapperCenter");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/WrapperCenter", "<init>", "()V", false);
            methodVisitor.visitFieldInsn(PUTSTATIC, "com/cleo/codebase/WrapperCenter", "INSTANCE", "Lcom/cleo/codebase/WrapperCenter;");
            methodVisitor.visitInsn(RETURN);
            methodVisitor.visitMaxs(2, 0);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}
