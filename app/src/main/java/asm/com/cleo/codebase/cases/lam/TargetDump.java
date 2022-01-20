package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class TargetDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "com/cleo/codebase/cases/lam/Target", null, "java/lang/Object", null);

        cw.visitSource("Target.kt", null);

        {
            av0 = cw.visitAnnotation("Lkotlin/Metadata;", true);
            av0.visit("mv", new int[]{1, 6, 0});
            av0.visit("k", new Integer(1));
            av0.visit("xi", new Integer(48));
            {
                AnnotationVisitor av1 = av0.visitArray("d1");
                av1.visit(null, "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00092\u00020\u0001:\u0001\u0009B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n");
                av1.visitEnd();
            }
            {
                AnnotationVisitor av1 = av0.visitArray("d2");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/Target;");
                av1.visit(null, "");
                av1.visit(null, "message");
                av1.visit(null, "");
                av1.visit(null, "(Ljava/lang/String;)V");
                av1.visit(null, "target5");
                av1.visit(null, "");
                av1.visit(null, "view");
                av1.visit(null, "Landroid/view/View;");
                av1.visit(null, "Companion");
                av1.visit(null, "app_debug");
                av1.visitEnd();
            }
            av0.visitEnd();
        }
        cw.visitInnerClass("com/cleo/codebase/cases/lam/Target$Companion", "com/cleo/codebase/cases/lam/Target", "Companion", ACC_PUBLIC + ACC_FINAL + ACC_STATIC);

        {
            fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;", null, null);
            {
                av0 = fv.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            fv.visitEnd();
        }
        {
            fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "message", "Ljava/lang/String;", null, null);
            {
                av0 = fv.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("message");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(13, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitFieldInsn(PUTFIELD, "com/cleo/codebase/cases/lam/Target", "message", "Ljava/lang/String;");
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/Target;", null, l0, l2, 0);
            mv.visitLocalVariable("message", "Ljava/lang/String;", null, l0, l2, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "target5", "(Landroid/view/View;)V", null, null);
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
            mv.visitLineNumber(15, l1);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("Click Me: ");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, "com/cleo/codebase/cases/lam/Target", "message", "Ljava/lang/String;");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "stringPlus", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", false);
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(16, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/Target;", null, l0, l3, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l3, 1);
            mv.visitMaxs(3, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "target6", "(Landroid/view/View;)V", null, null);
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
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target6", "(Landroid/view/View;)V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l1, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            mv.visitCode();
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target$Companion");
            mv.visitInsn(DUP);
            mv.visitInsn(ACONST_NULL);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target$Companion", "<init>", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", false);
            mv.visitFieldInsn(PUTSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitInsn(RETURN);
            mv.visitMaxs(3, 0);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
