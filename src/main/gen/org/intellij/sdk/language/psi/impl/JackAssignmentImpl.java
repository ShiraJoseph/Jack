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

public class JackAssignmentImpl extends ASTWrapperPsiElement implements JackAssignment {

  public JackAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JackAssignmentOperator getAssignmentOperator() {
    return findNotNullChildByClass(JackAssignmentOperator.class);
  }

  @Override
  @NotNull
  public JackLetKeyword getLetKeyword() {
    return findNotNullChildByClass(JackLetKeyword.class);
  }

  @Override
  @NotNull
  public JackStatementTerminator getStatementTerminator() {
    return findNotNullChildByClass(JackStatementTerminator.class);
  }

  @Override
  @Nullable
  public JackRoutineCall getRoutineCall() {
    return findChildByClass(JackRoutineCall.class);
  }

}
