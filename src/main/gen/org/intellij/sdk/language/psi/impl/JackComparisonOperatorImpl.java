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

public class JackComparisonOperatorImpl extends ASTWrapperPsiElement implements JackComparisonOperator {

  public JackComparisonOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitComparisonOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackEqualsOperator getEqualsOperator() {
    return findChildByClass(JackEqualsOperator.class);
  }

  @Override
  @Nullable
  public JackLessThanOperator getLessThanOperator() {
    return findChildByClass(JackLessThanOperator.class);
  }

  @Override
  @Nullable
  public JackMoreThanOperator getMoreThanOperator() {
    return findChildByClass(JackMoreThanOperator.class);
  }

}
