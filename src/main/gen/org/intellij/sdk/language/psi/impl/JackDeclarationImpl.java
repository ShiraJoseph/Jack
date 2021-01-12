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

public class JackDeclarationImpl extends ASTWrapperPsiElement implements JackDeclaration {

  public JackDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JackListSeparator> getListSeparatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackListSeparator.class);
  }

  @Override
  @NotNull
  public JackStatementTerminator getStatementTerminator() {
    return findNotNullChildByClass(JackStatementTerminator.class);
  }

  @Override
  @NotNull
  public JackVarKeyword getVarKeyword() {
    return findNotNullChildByClass(JackVarKeyword.class);
  }

  @Override
  @NotNull
  public JackType getType() {
    return findNotNullChildByClass(JackType.class);
  }

}
