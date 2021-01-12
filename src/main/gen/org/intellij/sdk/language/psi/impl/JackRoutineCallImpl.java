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

public class JackRoutineCallImpl extends ASTWrapperPsiElement implements JackRoutineCall {

  public JackRoutineCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitRoutineCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackClassMembership getClassMembership() {
    return findNotNullChildByClass(JackClassMembership.class);
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
  @Nullable
  public JackObjectType getObjectType() {
    return findChildByClass(JackObjectType.class);
  }

  @Override
  @NotNull
  public List<JackRoutineCall> getRoutineCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackRoutineCall.class);
  }

  @Override
  @NotNull
  public JackRoutineName getRoutineName() {
    return findNotNullChildByClass(JackRoutineName.class);
  }

}
