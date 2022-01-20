package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class HookedKotlinLamCasesDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", null, "com/cleo/codebase/cases/lam/LambdaCase", null);

        classWriter.visitSource("HookedKotlinLamCases.kt", null);

        {
            annotationVisitor0 = classWriter.visitAnnotation("Lkotlin/Metadata;", true);
            annotationVisitor0.visit("mv", new int[]{1, 6, 0});
            annotationVisitor0.visit("k", new Integer(1));
            annotationVisitor0.visit("xi", new Integer(48));
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d1");
                annotationVisitor1.visit(null, "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0009\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u0008H\u0002J\u0008\u0010\u000c\u001a\u00020\u0008H\u0002J\u0008\u0010\r\u001a\u00020\u0008H\u0002J\u0008\u0010\u000e\u001a\u00020\u0008H\u0002J\u0008\u0010\u000f\u001a\u00020\u0008H\u0002J\u0008\u0010\u0010\u001a\u00020\u0008H\u0002J\u0008\u0010\u0011\u001a\u00020\u0008H\u0002J\u0008\u0010\u0012\u001a\u00020\u0008H\u0002J\u0008\u0010\u0013\u001a\u00020\u0008H\u0002J\u0008\u0010\u0014\u001a\u00020\u0008H\u0002J\u0010\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0009\u001a\u00020\nH\u0002J\u0008\u0010\u0016\u001a\u00020\u0008H\u0002J\u0008\u0010\u0017\u001a\u00020\u0008H\u0002J\u001c\u0010\u0018\u001a\u00020\u00082\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u001aH\u0002J\u0008\u0010\u001b\u001a\u00020\u0008H\u0002J\u0008\u0010\u001c\u001a\u00020\u0008H\u0002J\u0008\u0010\u001d\u001a\u00020\u0008H\u0002J\u0008\u0010\u001e\u001a\u00020\u0008H\u0002J\u0008\u0010\u001f\u001a\u00020\u0008H\u0002J\u0008\u0010 \u001a\u00020\u0008H\u0002J\u0008\u0010!\u001a\u00020\u0008H\u0002J\u0008\u0010\"\u001a\u00020\u0008H\u0002J\u0008\u0010#\u001a\u00020\u0008H\u0016J\u0010\u0010$\u001a\u00020\u00082\u0006\u0010\u0009\u001a\u00020\nH\u0002J\u001c\u0010%\u001a\u00020\u00082\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006'");
                annotationVisitor1.visitEnd();
            }
            {
                AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("d2");
                annotationVisitor1.visit(null, "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;");
                annotationVisitor1.visit(null, "Lcom/cleo/codebase/cases/lam/LambdaCase;");
                annotationVisitor1.visit(null, "context");
                annotationVisitor1.visit(null, "Landroid/content/Context;");
                annotationVisitor1.visit(null, "(Landroid/content/Context;)V");
                annotationVisitor1.visit(null, "message");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "asmCreateFunction");
                annotationVisitor1.visit(null, "");
                annotationVisitor1.visit(null, "view");
                annotationVisitor1.visit(null, "Landroid/view/View;");
                annotationVisitor1.visit(null, "case1");
                annotationVisitor1.visit(null, "case10");
                annotationVisitor1.visit(null, "case2");
                annotationVisitor1.visit(null, "case3");
                annotationVisitor1.visit(null, "case4");
                annotationVisitor1.visit(null, "case5");
                annotationVisitor1.visit(null, "case6");
                annotationVisitor1.visit(null, "case7");
                annotationVisitor1.visit(null, "case8");
                annotationVisitor1.visit(null, "case9");
                annotationVisitor1.visit(null, "gtCase2");
                annotationVisitor1.visit(null, "happy1");
                annotationVisitor1.visit(null, "happy10");
                annotationVisitor1.visit(null, "happy11");
                annotationVisitor1.visit(null, "func");
                annotationVisitor1.visit(null, "Lkotlin/Function1;");
                annotationVisitor1.visit(null, "happy2");
                annotationVisitor1.visit(null, "happy3");
                annotationVisitor1.visit(null, "happy4");
                annotationVisitor1.visit(null, "happy5");
                annotationVisitor1.visit(null, "happy6");
                annotationVisitor1.visit(null, "happy7");
                annotationVisitor1.visit(null, "happy8");
                annotationVisitor1.visit(null, "happy9");
                annotationVisitor1.visit(null, "initAction");
                annotationVisitor1.visit(null, "target2");
                annotationVisitor1.visit(null, "testCase11");
                annotationVisitor1.visit(null, "Companion");
                annotationVisitor1.visit(null, "app_debug");
                annotationVisitor1.visitEnd();
            }
            annotationVisitor0.visitEnd();
        }
        classWriter.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

        {
            fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, null);
            {
                annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            fieldVisitor.visitEnd();
        }
        {
            fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "message", "Ljava/lang/String;", null, null);
            {
                annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            fieldVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Landroid/content/Context;)V", null, null);
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitLdcInsn("context");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(15, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase", "<init>", "(Landroid/content/Context;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(16, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("KotlinLamCases");
            methodVisitor.visitFieldInsn(PUTFIELD, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "message", "Ljava/lang/String;");
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(15, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("context", "Landroid/content/Context;", null, label0, label4, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asmCreateFunction", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitAnnotableParameterCount(1, false);
            {
                annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitLdcInsn("view");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(17, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initAction", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(20, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case1", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(24, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "case1$lambda-0", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(27, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy1", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(31, label0);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(35, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "target2", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(36, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(39, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "gtCase2", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(40, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case3", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(45, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "target3", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(46, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy3", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(49, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase3", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(50, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case4", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(55, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "target4", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(56, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy4", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(59, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase4", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(60, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case5", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(64, label0);
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitLdcInsn("Hello target5");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(65, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(66, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label3, 0);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy5", "()V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1;", false);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lkotlin/jvm/functions/Function1;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "happy5$lambda-1", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(71, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label3, 0);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case6", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(75, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target6", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(76, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy6", "()V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase6", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(81, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label1, label3, 1);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label3, 0);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case7", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(85, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target7", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(86, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy7", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(89, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase7", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(90, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case8", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(94, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetObject", "target8", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(95, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy8", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(98, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase8", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(99, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case9", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(103, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/TargetObject", "INSTANCE", "Lcom/cleo/codebase/cases/lam/TargetObject;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/TargetObject;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/TargetObject", "target9", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(104, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy9", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(107, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase9", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(108, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "case10", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(112, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(113, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy10", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(116, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase10", "(Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(117, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "testCase11", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1<-Landroid/view/View;Lkotlin/Unit;>;)V", null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(121, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lkotlin/jvm/functions/Function1;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "testCase11$lambda-2", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(122, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("func", "Lkotlin/jvm/functions/Function1;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "happy11", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1<-Landroid/view/View;Lkotlin/Unit;>;)V", null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(125, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase11", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", false);
            methodVisitor.visitInvokeDynamicInsn("onClick", "(Lkotlin/jvm/functions/Function1;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "happy11$lambda-3", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", false), Type.getType("(Landroid/view/View;)V")});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(126, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("func", "Lkotlin/jvm/functions/Function1;", null, label0, label2, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "target2", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(129, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("Click Me: target2 ");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETFIELD, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "message", "Ljava/lang/String;");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "stringPlus", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", false);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(130, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(3, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "gtCase2", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(135, label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(136, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "target2", "(Landroid/view/View;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(137, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(138, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label4, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "case1$lambda-0", "(Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(25, label0);
            methodVisitor.visitLdcInsn("LambdaCases");
            methodVisitor.visitLdcInsn("Click Me case1");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            methodVisitor.visitInsn(POP);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(26, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("it", "Landroid/view/View;", null, label0, label2, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "happy5$lambda-1", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("$tmp0");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(70, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEINTERFACE, "kotlin/jvm/functions/Function1", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("$tmp0", "Lkotlin/jvm/functions/Function1;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("p0", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "testCase11$lambda-2", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("$tmp0");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(121, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEINTERFACE, "kotlin/jvm/functions/Function1", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("$tmp0", "Lkotlin/jvm/functions/Function1;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("p0", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "happy11$lambda-3", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitLdcInsn("$tmp0");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(125, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEINTERFACE, "kotlin/jvm/functions/Function1", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
            methodVisitor.visitInsn(POP);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("$tmp0", "Lkotlin/jvm/functions/Function1;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("p0", "Landroid/view/View;", null, label0, label2, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "target3", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "target3", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase3", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase3", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase4", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase4", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1;", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1<Landroid/view/View;Lkotlin/Unit;>;", null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                annotationVisitor0.visitEnd();
            }
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1;", false);
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase6", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase6", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase7", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase7", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase8", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase8", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase9", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase9", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase10", "(Landroid/view/View;)V", null, null);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase10", "(Landroid/view/View;)V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "gtCase11", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1<-Landroid/view/View;Lkotlin/Unit;>;)Lkotlin/jvm/functions/Function1<Landroid/view/View;Lkotlin/Unit;>;", null);
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                annotationVisitor0.visitEnd();
            }
            {
                annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
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
            methodVisitor.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase11", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", false);
            methodVisitor.visitInsn(ARETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("func", "Lkotlin/jvm/functions/Function1;", null, label0, label1, 0);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            methodVisitor.visitCode();
            methodVisitor.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitInsn(ACONST_NULL);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "<init>", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", false);
            methodVisitor.visitFieldInsn(PUTSTATIC, "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
            methodVisitor.visitInsn(RETURN);
            methodVisitor.visitMaxs(3, 0);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}
