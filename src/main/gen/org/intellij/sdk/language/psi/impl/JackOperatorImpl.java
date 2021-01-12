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

public class JackOperatorImpl extends ASTWrapperPsiElement implements JackOperator {

  public JackOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackDivideOperator getDivideOperator() {
    return findChildByClass(JackDivideOperator.class);
  }

  @Override
  @Nullable
  public JackMinusOperator getMinusOperator() {
    return findChildByClass(JackMinusOperator.class);
  }

  @Override
  @Nullable
  public JackPlusOperator getPlusOperator() {
    return findChildByClass(JackPlusOperator.class);
  }

  @Override
  @Nullable
  public JackTimesOperator getTimesOperator() {
    return findChildByClass(JackTimesOperator.class);
  }

}
