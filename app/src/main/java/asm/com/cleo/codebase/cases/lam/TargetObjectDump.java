package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class TargetObjectDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "com/cleo/codebase/cases/lam/TargetObject", null, "java/lang/Object", null);

        cw.visitSource("TargetObject.kt", null);

        {
            av0 = cw.visitAnnotation("Lkotlin/Metadata;", true);
            av0.visit("mv", new int[]{1, 6, 0});
            av0.visit("k", new Integer(1));
            av0.visit("xi", new Integer(48));
            {
                AnnotationVisitor av1 = av0.visitArray("d1");
                av1.visit(null, "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008");
                av1.visitEnd();
            }
            {
                AnnotationVisitor av1 = av0.visitArray("d2");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/TargetObject;");
                av1.visit(null, "");
                av1.visit(null, "()V");
                av1.visit(null, "target8");
                av1.visit(null, "");
                av1.visit(null, "view");
                av1.visit(null, "Landroid/view/View;");
                av1.visit(null, "target9");
                av1.visit(null, "app_debug");
                av1.visitEnd();
            }
            av0.visitEnd();
        }
        {
            fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "INSTANCE", "Lcom/cleo/codebase/cases/lam/TargetObject;", null, null);
            {
                av0 = fv.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(13, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/TargetObject;", null, l0, l1, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "target8", "(Landroid/view/View;)V", null, null);
            {
                av0 = mv.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                av0.visitEnd();
            }
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(16, l1);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("target8");
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(17, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l3, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "target9", "(Landroid/view/View;)V", null, null);
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(19, l1);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("target9");
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(20, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/TargetObject;", null, l0, l3, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l3, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            mv.visitCode();
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/TargetObject");
            mv.visitInsn(DUP);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/TargetObject", "<init>", "()V", false);
            mv.visitFieldInsn(PUTSTATIC, "com/cleo/codebase/cases/lam/TargetObject", "INSTANCE", "Lcom/cleo/codebase/cases/lam/TargetObject;");
            mv.visitInsn(RETURN);
            mv.visitMaxs(2, 0);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
