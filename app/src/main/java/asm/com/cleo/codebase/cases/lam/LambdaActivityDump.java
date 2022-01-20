package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class LambdaActivityDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/cleo/codebase/cases/lam/LambdaActivity", null, "com/cleo/codebase/cases/BaseCaseActivity", null);

        classWriter.visitSource("LambdaActivity.kt", null);

        {
            annotationVisitor0 = classWriter.visitAnnotation("Lkotlin/Metadata;", true);
            annotationVisitor0.visit("mv", new int[]{1, 6, 0});
            annotationVisitor0.visit("k", new Integer(1));
            annotationVisitor0.visit("xi", new Integer(48));
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d1");
                annotationVisitor1.visit(null, "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0014\u00a8\u0006\u0005");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d2");
                annotationVisitor1.visit(null, "Lcom/cleo/codebase/cases/lam/LambdaActivity;");
                annotationVisitor1.visit(null, "Lcom/cleo/codebase/cases/BaseCaseActivity;");
                annotationVisitor1.visit(null, "()V");
                annotationVisitor1.visit(null, "initView");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "app_debug");
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(5, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "<init>", "()V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/LambdaActivity;", null, label0, label1, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initView", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(7, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/LambdaCase1");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(CHECKCAST, "android/content/Context");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase1", "<init>", "(Landroid/content/Context;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "com/cleo/codebase/cases/ActionButton");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "addCase", "(Lcom/cleo/codebase/cases/ActionButton;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(8, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/LambdaCase2");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(CHECKCAST, "android/content/Context");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase2", "<init>", "(Landroid/content/Context;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "com/cleo/codebase/cases/ActionButton");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "addCase", "(Lcom/cleo/codebase/cases/ActionButton;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(9, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/LambdaCase3");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(CHECKCAST, "android/content/Context");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase3", "<init>", "(Landroid/content/Context;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "com/cleo/codebase/cases/ActionButton");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "addCase", "(Lcom/cleo/codebase/cases/ActionButton;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(10, label3);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/LambdaCase4");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(CHECKCAST, "android/content/Context");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase4", "<init>", "(Landroid/content/Context;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "com/cleo/codebase/cases/ActionButton");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "addCase", "(Lcom/cleo/codebase/cases/ActionButton;)V", false);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLineNumber(11, label4);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/LambdaCase5");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(CHECKCAST, "android/content/Context");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase5", "<init>", "(Landroid/content/Context;)V", false);
            methodVisitor.visitTypeInsn(CHECKCAST, "com/cleo/codebase/cases/ActionButton");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/BaseCaseActivity", "addCase", "(Lcom/cleo/codebase/cases/ActionButton;)V", false);
            Label label5 = new Label();
            methodVisitor.visitLabel(label5);
            methodVisitor.visitLineNumber(12, label5);
            methodVisitor.visitInsn(RETURN);
            Label label6 = new Label();
            methodVisitor.visitLabel(label6);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/LambdaActivity;", null, label0, label6, 0);
            methodVisitor.visitMaxs(4, 1);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}
