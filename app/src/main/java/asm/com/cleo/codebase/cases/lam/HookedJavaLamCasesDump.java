package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class HookedJavaLamCasesDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_SUPER, "com/cleo/codebase/cases/lam/HookedJavaLamCases", null, "com/cleo/codebase/cases/lam/LambdaCase", null);

        classWriter.visitSource("HookedJavaLamCases.java", null);

        classWriter.visitInnerClass("android/view/View$OnClickListener", "android/view/View", "OnClickListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

        classWriter.visitInnerClass("com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

        classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Landroid/content/Context;)V", null, null);
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
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
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
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asmCreateFunction", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(29, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label1, 0);
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
            methodVisitor.visitInvokeDynamicInsn("onClick",
                    "()Landroid/view/View$OnClickListener;",
                    new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false),
                    Type.getType("(Landroid/view/View;)V"),
                    new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "lambda$case1$0", "(Landroid/view/View;)V", false),
                    Type.getType("(Landroid/view/View;)V"));
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(34, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy1", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(38, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(42, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "target2", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(43, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(46, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase2", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(47, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case3", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(51, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "target3", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(52, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy3", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(55, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase3", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(56, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case4", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(60, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target4", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(61, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(3, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy4", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(64, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase4", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(65, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case5", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(69, label0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("Hello target5");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(70, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(71, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy5", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(74, label0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("Hello target5");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(75, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", false);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(76, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy52", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(79, label0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("Hello target5");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(80, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "lambda$happy52$1", "(Lcom/cleo/codebase/cases/lam/Target;Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(85, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case6", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(89, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "target6", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(90, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy6", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(93, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase6", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(94, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "case10", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(98, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(99, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "happy10", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(102, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "gtCase10", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(103, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "target2", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(107, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("Click Me: target2 $message");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(108, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "gtCase2", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(113, label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(114, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "target2", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(115, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(116, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedJavaLamCases;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "target6", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(120, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("target6");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(121, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "gtCase3", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(125, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(126, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "target3", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(127, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(128, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "gtCase4", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(131, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(132, label1);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target4", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(133, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(134, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(137, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "lambda$gtCase5$2", "(Lcom/cleo/codebase/cases/lam/Target;Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label0, label1, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "gtCase6", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(145, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(146, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedJavaLamCases", "target6", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(147, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(148, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "gtCase10", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(151, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(152, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(153, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(154, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$gtCase5$2", "(Lcom/cleo/codebase/cases/lam/Target;Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(138, label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(139, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(140, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(141, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$happy52$1", "(Lcom/cleo/codebase/cases/lam/Target;Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(81, label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(82, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(83, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(84, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 1);
            methodVisitor.visitMaxs(2, 2);
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
