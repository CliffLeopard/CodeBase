package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class HookedKotlinLamCasesCompanionDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", null, "java/lang/Object", null);

        cw.visitSource("HookedKotlinLamCases.kt", null);

        {
            av0 = cw.visitAnnotation("Lkotlin/Metadata;", true);
            av0.visit("mv", new int[]{1, 6, 0});
            av0.visit("k", new Integer(1));
            av0.visit("xi", new Integer(48));
            {
                AnnotationVisitor av1 = av0.visitArray("d1");
                av1.visit(null, "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00082\u0012\u0010\u0009\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0008H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0015");
                av1.visitEnd();
            }
            {
                AnnotationVisitor av1 = av0.visitArray("d2");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;");
                av1.visit(null, "");
                av1.visit(null, "()V");
                av1.visit(null, "gtCase10");
                av1.visit(null, "");
                av1.visit(null, "view");
                av1.visit(null, "Landroid/view/View;");
                av1.visit(null, "gtCase11");
                av1.visit(null, "Lkotlin/Function1;");
                av1.visit(null, "func");
                av1.visit(null, "gtCase3");
                av1.visit(null, "gtCase4");
                av1.visit(null, "gtCase5");
                av1.visit(null, "target");
                av1.visit(null, "Lcom/cleo/codebase/cases/lam/Target;");
                av1.visit(null, "gtCase6");
                av1.visit(null, "gtCase7");
                av1.visit(null, "gtCase8");
                av1.visit(null, "gtCase9");
                av1.visit(null, "target3");
                av1.visit(null, "target4");
                av1.visit(null, "app_debug");
                av1.visitEnd();
            }
            av0.visitEnd();
        }
        cw.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", null, null, ACC_FINAL + ACC_STATIC);

        cw.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase11$1", null, null, ACC_FINAL + ACC_STATIC);

        cw.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", ACC_PUBLIC + ACC_FINAL + ACC_STATIC);

        {
            mv = cw.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(140, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l1, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "target3", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(143, l1);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("target3");
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(144, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l3, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l3, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "target4", "(Landroid/view/View;)V", null, null);
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
            mv.visitLineNumber(147, l1);
            mv.visitLdcInsn("LambdaCases");
            mv.visitLdcInsn("target4");
            mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "e", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(POP);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(148, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l3, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l3, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase3", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(153, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(154, l2);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "target3", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(155, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(156, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase4", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(160, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(161, l2);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "target4", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(162, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(163, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1;", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1<Landroid/view/View;Lkotlin/Unit;>;", null);
            {
                av0 = mv.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                av0.visitEnd();
            }
            {
                av0 = mv.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("target");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(167, l1);
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1");
            mv.visitInsn(DUP);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", "<init>", "(Lcom/cleo/codebase/cases/lam/Target;)V", false);
            mv.visitTypeInsn(CHECKCAST, "kotlin/jvm/functions/Function1");
            mv.visitInsn(ARETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l2, 0);
            mv.visitLocalVariable("target", "Lcom/cleo/codebase/cases/lam/Target;", null, l0, l2, 1);
            mv.visitMaxs(3, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase6", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(176, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(177, l2);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target6", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(178, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(179, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase7", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(183, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(184, l2);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/Target", "Companion", "Lcom/cleo/codebase/cases/lam/Target$Companion;");
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target$Companion", "target7", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(185, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(186, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase8", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(190, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(191, l2);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetObject", "target8", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(192, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(193, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase9", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(197, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(198, l2);
            mv.visitFieldInsn(GETSTATIC, "com/cleo/codebase/cases/lam/TargetObject", "INSTANCE", "Lcom/cleo/codebase/cases/lam/TargetObject;");
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/TargetObject", "target9", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(199, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(200, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase10", "(Landroid/view/View;)V", null, null);
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
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("view");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(204, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(205, l2);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/cases/lam/TargetJava", "target10", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(206, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(207, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l5, 0);
            mv.visitLocalVariable("view", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "gtCase11", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1<-Landroid/view/View;Lkotlin/Unit;>;)Lkotlin/jvm/functions/Function1<Landroid/view/View;Lkotlin/Unit;>;", null);
            {
                av0 = mv.visitAnnotation("Lkotlin/jvm/JvmStatic;", true);
                av0.visitEnd();
            }
            {
                av0 = mv.visitAnnotation("Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("func");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(211, l1);
            mv.visitTypeInsn(NEW, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase11$1");
            mv.visitInsn(DUP);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase11$1", "<init>", "(Lkotlin/jvm/functions/Function1;)V", false);
            mv.visitTypeInsn(CHECKCAST, "kotlin/jvm/functions/Function1");
            mv.visitInsn(ARETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l2, 0);
            mv.visitLocalVariable("func", "Lkotlin/jvm/functions/Function1;", null, l0, l2, 1);
            mv.visitMaxs(3, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_SYNTHETIC, "<init>", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion;", null, l0, l1, 0);
            mv.visitLocalVariable("$constructor_marker", "Lkotlin/jvm/internal/DefaultConstructorMarker;", null, l0, l1, 1);
            mv.visitMaxs(1, 2);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
