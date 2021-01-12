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

public class JackComparisonImpl extends ASTWrapperPsiElement implements JackComparison {

  public JackComparisonImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitComparison(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackCloseParenthesis getCloseParenthesis() {
    return findChildByClass(JackCloseParenthesis.class);
  }

  @Override
  @Nullable
  public JackOpenParenthesis getOpenParenthesis() {
    return findChildByClass(JackOpenParenthesis.class);
  }

  @Override
  @Nullable
  public JackBoolean getBoolean() {
    return findChildByClass(JackBoolean.class);
  }

  @Override
  @Nullable
  public JackComparison getComparison() {
    return findChildByClass(JackComparison.class);
  }

  @Override
  @Nullable
  public JackComparisonOperator getComparisonOperator() {
    return findChildByClass(JackComparisonOperator.class);
  }

}
