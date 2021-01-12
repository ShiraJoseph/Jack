// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.JackTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class JackRoutineImpl extends ASTWrapperPsiElement implements JackRoutine {

  public JackRoutineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitRoutine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackConstructor getConstructor() {
    return findChildByClass(JackConstructor.class);
  }

  @Override
  @Nullable
  public JackFunction getFunction() {
    return findChildByClass(JackFunction.class);
  }

  @Override
  @Nullable
  public JackMethod getMethod() {
    return findChildByClass(JackMethod.class);
  }

}
