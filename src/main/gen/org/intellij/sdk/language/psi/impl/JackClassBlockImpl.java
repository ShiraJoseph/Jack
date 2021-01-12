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

public class JackClassBlockImpl extends ASTWrapperPsiElement implements JackClassBlock {

  public JackClassBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitClassBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackClassKeyword getClassKeyword() {
    return findNotNullChildByClass(JackClassKeyword.class);
  }

  @Override
  @NotNull
  public JackCloseBrace getCloseBrace() {
    return findNotNullChildByClass(JackCloseBrace.class);
  }

  @Override
  @NotNull
  public JackOpenBrace getOpenBrace() {
    return findNotNullChildByClass(JackOpenBrace.class);
  }

  @Override
  @Nullable
  public JackConstructor getConstructor() {
    return findChildByClass(JackConstructor.class);
  }

  @Override
  @NotNull
  public List<JackDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackDeclaration.class);
  }

  @Override
  @NotNull
  public List<JackRoutine> getRoutineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackRoutine.class);
  }

  @Override
  @NotNull
  public JackUserClassType getUserClassType() {
    return findNotNullChildByClass(JackUserClassType.class);
  }

}
