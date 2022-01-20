package asm.com.cleo.codebase.cases.lam;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class HookedKotlinLamCasesCompaniongtCase51Dump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_FINAL + ACC_SUPER, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", "Lkotlin/jvm/internal/Lambda;Lkotlin/jvm/functions/Function1<Landroid/view/View;Lkotlin/Unit;>;", "kotlin/jvm/internal/Lambda", new String[]{"kotlin/jvm/functions/Function1"});

        cw.visitSource("HookedKotlinLamCases.kt", null);

        cw.visitOuterClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "gtCase5", "(Lcom/cleo/codebase/cases/lam/Target;)Lkotlin/jvm/functions/Function1;");

        {
            av0 = cw.visitAnnotation("Lkotlin/Metadata;", true);
            av0.visit("mv", new int[]{1, 6, 0});
            av0.visit("k", new Integer(3));
            av0.visit("xi", new Integer(48));
            {
                AnnotationVisitor av1 = av0.visitArray("d1");
                av1.visit(null, "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004");
                av1.visitEnd();
            }
            {
                AnnotationVisitor av1 = av0.visitArray("d2");
                av1.visit(null, "<anonymous>");
                av1.visit(null, "");
                av1.visit(null, "it");
                av1.visit(null, "Landroid/view/View;");
                av1.visit(null, "invoke");
                av1.visitEnd();
            }
            av0.visitEnd();
        }
        cw.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", null, null, ACC_FINAL + ACC_STATIC);

        cw.visitInnerClass("com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion", "com/cleo/codebase/cases/lam/HookedKotlinLamCases", "Companion", ACC_PUBLIC + ACC_FINAL + ACC_STATIC);

        {
            fv = cw.visitField(ACC_FINAL + ACC_SYNTHETIC, "$target", "Lcom/cleo/codebase/cases/lam/Target;", null, null);
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(0, "<init>", "(Lcom/cleo/codebase/cases/lam/Target;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitFieldInsn(PUTFIELD, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", "$target", "Lcom/cleo/codebase/cases/lam/Target;");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitInsn(ICONST_1);
            mv.visitMethodInsn(INVOKESPECIAL, "kotlin/jvm/internal/Lambda", "<init>", "(I)V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1;", null, l0, l1, 0);
            mv.visitLocalVariable("$target", "Lcom/cleo/codebase/cases/lam/Target;", null, l0, l1, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "invoke", "(Landroid/view/View;)V", null, null);
            {
                av0 = mv.visitParameterAnnotation(0, "Lorg/jetbrains/annotations/NotNull;", false);
                av0.visitEnd();
            }
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("it");
            mv.visitMethodInsn(INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "checkNotNullParameter", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(168, l1);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickBefore", "(Landroid/view/View;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(169, l2);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", "$target", "Lcom/cleo/codebase/cases/lam/Target;");
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/Target", "target5", "(Landroid/view/View;)V", false);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(170, l3);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESTATIC, "com/cleo/codebase/WrapperCenter", "wrapOnClickAfter", "(Landroid/view/View;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(171, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1;", null, l0, l5, 0);
            mv.visitLocalVariable("it", "Landroid/view/View;", null, l0, l5, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE + ACC_SYNTHETIC, "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(167, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitTypeInsn(CHECKCAST, "android/view/View");
            mv.visitMethodInsn(INVOKEVIRTUAL, "com/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1", "invoke", "(Landroid/view/View;)V", false);
            mv.visitFieldInsn(GETSTATIC, "kotlin/Unit", "INSTANCE", "Lkotlin/Unit;");
            mv.visitInsn(ARETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/cleo/codebase/cases/lam/HookedKotlinLamCases$Companion$gtCase5$1;", null, l0, l1, 0);
            mv.visitLocalVariable("p1", "Ljava/lang/Object;", null, l0, l1, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
