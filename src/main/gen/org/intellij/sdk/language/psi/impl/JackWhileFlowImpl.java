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

public class JackWhileFlowImpl extends ASTWrapperPsiElement implements JackWhileFlow {

  public JackWhileFlowImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitWhileFlow(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackCloseParenthesis getCloseParenthesis() {
    return findNotNullChildByClass(JackCloseParenthesis.class);
  }

  @Override
  @NotNull
  public JackOpenParenthesis getOpenParenthesis() {
    return findNotNullChildByClass(JackOpenParenthesis.class);
  }

  @Override
  @NotNull
  public JackWhileKeyword getWhileKeyword() {
    return findNotNullChildByClass(JackWhileKeyword.class);
  }

  @Override
  @NotNull
  public JackCodeBlock getCodeBlock() {
    return findNotNullChildByClass(JackCodeBlock.class);
  }

  @Override
  @NotNull
  public JackCondition getCondition() {
    return findNotNullChildByClass(JackCondition.class);
  }

}
