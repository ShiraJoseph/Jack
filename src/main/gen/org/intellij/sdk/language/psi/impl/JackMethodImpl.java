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

public class JackMethodImpl extends ASTWrapperPsiElement implements JackMethod {

  public JackMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitMethod(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackCloseBrace getCloseBrace() {
    return findNotNullChildByClass(JackCloseBrace.class);
  }

  @Override
  @NotNull
  public JackMethodKeyword getMethodKeyword() {
    return findNotNullChildByClass(JackMethodKeyword.class);
  }

  @Override
  @NotNull
  public JackOpenBrace getOpenBrace() {
    return findNotNullChildByClass(JackOpenBrace.class);
  }

  @Override
  @NotNull
  public JackParameters getParameters() {
    return findNotNullChildByClass(JackParameters.class);
  }

  @Override
  @NotNull
  public JackReturnStatement getReturnStatement() {
    return findNotNullChildByClass(JackReturnStatement.class);
  }

  @Override
  @NotNull
  public JackRoutineBlock getRoutineBlock() {
    return findNotNullChildByClass(JackRoutineBlock.class);
  }

  @Override
  @NotNull
  public JackType getType() {
    return findNotNullChildByClass(JackType.class);
  }

}
