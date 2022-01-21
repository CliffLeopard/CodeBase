package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class JavaLamCasesDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/cleo/codebase/cases/lam/JavaLamCases", null, "com/cleo/codebase/cases/lam/LambdaCase", null);

        classWriter.visitSource("JavaLamCases.java", null);

        classWriter.visitInnerClass("android/view/View$OnClickListener", "android/view/View", "OnClickListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

        classWriter.visitInnerClass("com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

        classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Landroid/content/Context;)V", null, null);
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Landroidx/annotation/NonNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(18, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase", "<init>", "(Landroid/content/Context;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(19, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("context", "Landroid/content/Context;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initAction", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(24, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asmCreateFunction", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Landroidx/annotation/NonNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(29, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label1, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 1);
            methodVisitor.visitMaxs(0, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case1", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(33, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/JavaLamCases", "lambda$case1$0", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(34, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(38, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/JavaLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "com/cleo/codebase/cases/lam/JavaLamCases", "target2", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(39, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case3", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(43, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "target3", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(44, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case4", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(48, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target4", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(49, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(3, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case5", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(53, label0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("Hello target5");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(54, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(55, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case6", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(59, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/JavaLamCases", "target6", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(60, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case10", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(64, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/JavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(65, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "target2", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(68, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("Click Me: target2 $message");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(69, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/JavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "target6", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(72, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("target3");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(73, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$case1$0", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(33, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("Click Me case1");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}
