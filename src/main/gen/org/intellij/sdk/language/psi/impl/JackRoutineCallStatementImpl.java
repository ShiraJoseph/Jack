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

public class JackRoutineCallStatementImpl extends ASTWrapperPsiElement implements JackRoutineCallStatement {

  public JackRoutineCallStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitRoutineCallStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackDoKeyword getDoKeyword() {
    return findNotNullChildByClass(JackDoKeyword.class);
  }

  @Override
  @NotNull
  public JackStatementTerminator getStatementTerminator() {
    return findNotNullChildByClass(JackStatementTerminator.class);
  }

  @Override
  @NotNull
  public JackRoutineCall getRoutineCall() {
    return findNotNullChildByClass(JackRoutineCall.class);
  }

}
