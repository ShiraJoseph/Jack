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

public class JackBooleanImpl extends ASTWrapperPsiElement implements JackBoolean {

  public JackBooleanImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitBoolean(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackFalseKeyword getFalseKeyword() {
    return findChildByClass(JackFalseKeyword.class);
  }

  @Override
  @Nullable
  public JackNotOperator getNotOperator() {
    return findChildByClass(JackNotOperator.class);
  }

  @Override
  @Nullable
  public JackTrueKeyword getTrueKeyword() {
    return findChildByClass(JackTrueKeyword.class);
  }

  @Override
  @Nullable
  public JackCondition getCondition() {
    return findChildByClass(JackCondition.class);
  }

  @Override
  @Nullable
  public JackRoutineCall getRoutineCall() {
    return findChildByClass(JackRoutineCall.class);
  }

}
