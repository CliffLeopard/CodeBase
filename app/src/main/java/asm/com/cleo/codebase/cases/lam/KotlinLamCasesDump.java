package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class KotlinLamCasesDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "com/cleo/codebase/cases/lam/KotlinLamCases", null, "com/cleo/codebase/cases/lam/LambdaCase", null);

        cw.visitSource("KotlinLamCases.kt", null);

        {
            av0 = cw.visitAnnotation("Lkotlin/Metadata;", true);
            av0.visit("mv", new int[]{1, 6, 0});
            av0.visit("k", new Integer(1));
            av0.visit("xi", new Integer(48));
            {
                AnnotationVisitor av1 = av0.visitArray("d1");
                av1.visit(null, "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0009\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u0008H\u0002J\u0008\u0010\u000c\u001a\u00020\u0008H\u0002J\u0008\u0010\r\u001a\u00020\u0008H\u0002J\u0008\u0010\u000e\u001a\u00020\u0008H\u0002J\u0008\u0010\u000f\u001a\u00020\u0008H\u0002J\u0008\u0010\u0010\u001a\u00020\u0008H\u0002J\u0008\u0010\u0011\u001a\u00020\u0008H\u0002J\u0008\u0010\u0012\u001a\u00020\u0008H\u0002J\u0008\u0010\u0013\u001a\u00020\u0008H\u0002J\u0008\u0010\u0014\u001a\u00020\u0008H\u0002J\u0008\u0010\u0015\u001a\u00020\u0008H\u0016J\u0010\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0009\u001a\u00020\nH\u0002J\u001c\u0010\u0017\u001a\u00020\u00082\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b");
                av1.visitEnd();
            }
            {
                AnnotationVisitor av1 = av0.visitArray("d2");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/KotlinLamCases;");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/LambdaCase;");
                av1.visit(null, "context");
                av1.visit(null, "Landroid/content/Context;");
                av1.visit(null, "(Landroid/content/Context;)V");
                av1.visit(null, "message");
                av1.visit(null, "");
                av1.visit(null, "asmCreateFunction");
                av1.visit(null, "");
                av1.visit(null, "view");
                av1.visit(null, "Landroid/view/View;");
                av1.visit(null, "case1");
                av1.visit(null, "case10");
                av1.visit(null, "case2");
                av1.visit(null, "case3");
                av1.visit(null, "case4");
                av1.visit(null, "case5");
                av1.visit(null, "case6");
                av1.visit(null, "case7");
                av1.visit(null, "case8");
                av1.visit(null, "case9");
                av1.visit(null, "initAction");
                av1.visit(null, "target2");
                av1.visit(null, "testCase11");
                av1.visit(null, "func");
                av1.visit(null, "Lkotlin/Function1;");
                av1.visit(null, "Companion");
                av1.visit(null, "app_debug");
                av1.visitEnd();
            }
            av0.visitEnd();
        }
        cw.visitInnerClass("com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", ACC_PUBLIC + ACC_FINAL + ACC_STATIC);

        {
            fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;", null, null);
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
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Landroid/content/Context;)V", null, null);
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("context");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(14, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/LambdaCase", "<init>", "(Landroid/content/Context;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(15, l2);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitLdcInsn("KotlinLamCases");
            mv.visitFieldInsn(PUTFIELD, "com/cleo/codebase/cases/lam/KotlinLamCases", "message", "Ljava/lang/String;");
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(14, l3);
            mv.visitInsn(RETURN);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l4, 0);
            mv.visitLocalVariable("context", "Landroid/content/Context;", null, l0, l4, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "asmCreateFunction", "(Landroid/view/View;)V", null, null);
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
            mv.visitLineNumber(17, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l2, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "initAction", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(20, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "case1", "()V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(21, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case1", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(25, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "case1$lambda-0", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(28, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case2", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(32, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/KotlinLamCases;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "target2", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(33, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case3", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(37, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target3", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(38, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case4", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(42, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target4", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(43, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case5", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(47, l0);
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/Target");
            mv.visitInsn(DUP);
            mv.visitLdcInsn("Hello target5");
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/Target", "<init>", "(Ljava/lang/String;)V", false);
            mv.visitVarInsn(ASTORE, 1);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(48, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(49, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, l1, l3, 1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l3, 0);
            mv.visitMaxs(3, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case6", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(53, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target6", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(54, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case7", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(58, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/Target$Companion;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target7", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(59, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case8", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(63, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetObject", "target8", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(64, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case9", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(68, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/TargetObject", "INSTANCE", "Lcom/cleo/codebase/cases/lam/TargetObject;");
            mv.visitInvokeDynamicInsn("onClick", "(Lcom/cleo/codebase/cases/lam/TargetObject;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/TargetObject", "target9", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(69, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "case10", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(73, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitInvokeDynamicInsn("onClick", "()Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(74, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "testCase11", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1<-Landroid/view/View;Lkotlin/Unit;>;)V", null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(78, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitInvokeDynamicInsn("onClick", "(Lkotlin/jvm/functions/Function1;)Landroid/view/View$OnClickListener;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"), new Object[]{Type.getType("(Landroid/view/View;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "testCase11$lambda-1", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V"), Type.getType("(Landroid/view/View;)V")});
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(79, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitLocalVariable("func", "Lkotlin/jvm/functions/Function1;", null, l0, l2, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "target2", "(Landroid/view/View;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(82, l0);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("Click Me: target2 ");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, "com/cleo/codebase/cases/lam/KotlinLamCases", "message", "Ljava/lang/String;");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "stringPlus", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", false);
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(83, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/KotlinLamCases;", null, l0, l2, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l2, 1);
            mv.visitMaxs(3, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL + ACC_STATIC, "case1$lambda-0", "(Landroid/view/View;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(26, l0);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("Click Me case1");
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(27, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("it", "Landroid/view/View;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL + ACC_STATIC, "testCase11$lambda-1", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitLdcInsn("$tmp0");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(78, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEINTERFACE, "kotlin/jvm/functions/Function1", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
            mv.visitInsn(POP);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("$tmp0", "Lkotlin/jvm/functions/Function1;", null, l0, l2, 0);
            mv.visitLocalVariable("p0", "Landroid/view/View;", null, l0, l2, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "target3", "(Landroid/view/View;)V", null, null);
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
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "target3", "(Landroid/view/View;)V", false);
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
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion");
            mv.visitInsn(DUP);
            mv.visitInsn(ACONST_NULL);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/KotlinLamCases$Companion", "<init>", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", false);
            mv.visitFieldInsn(PUTSTATIC, "com/cleo/codebase/cases/lam/KotlinLamCases", "Companion", "Lcom/cleo/codebase/cases/lam/KotlinLamCases$Companion;");
            mv.visitInsn(RETURN);
            mv.visitMaxs(3, 0);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
