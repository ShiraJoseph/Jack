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

public class JackConditionImpl extends ASTWrapperPsiElement implements JackCondition {

  public JackConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JackAndOperator> getAndOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackAndOperator.class);
  }

  @Override
  @NotNull
  public List<JackOrOperator> getOrOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackOrOperator.class);
  }

  @Override
  @NotNull
  public JackComparison getComparison() {
    return findNotNullChildByClass(JackComparison.class);
  }

  @Override
  @NotNull
  public List<JackCondition> getConditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackCondition.class);
  }

}
