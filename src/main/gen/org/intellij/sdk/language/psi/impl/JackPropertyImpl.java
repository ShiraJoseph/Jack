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
import com.intellij.navigation.ItemPresentation;

public class JackPropertyImpl extends JackNamedElementImpl implements JackProperty {

  public JackPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return JackPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return JackPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return JackPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return JackPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return JackPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return JackPsiImplUtil.getPresentation(this);
  }

}
