// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.JackTypes.*;
import org.intellij.sdk.language.psi.*;

public class JackMyFileImpl extends JackNamedElementImpl implements JackMyFile {

  public JackMyFileImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitMyFile(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackClassBlock getClassBlock() {
    return findChildByClass(JackClassBlock.class);
  }

  @Override
  @NotNull
  public List<JackNonCode> getNonCodeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JackNonCode.class);
  }

}
