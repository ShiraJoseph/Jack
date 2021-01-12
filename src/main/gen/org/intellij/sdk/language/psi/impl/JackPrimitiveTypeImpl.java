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

public class JackPrimitiveTypeImpl extends ASTWrapperPsiElement implements JackPrimitiveType {

  public JackPrimitiveTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitPrimitiveType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackBoolean getBoolean() {
    return findChildByClass(JackBoolean.class);
  }

  @Override
  @Nullable
  public JackChar getChar() {
    return findChildByClass(JackChar.class);
  }

  @Override
  @Nullable
  public JackInt getInt() {
    return findChildByClass(JackInt.class);
  }

  @Override
  @Nullable
  public JackVoid getVoid() {
    return findChildByClass(JackVoid.class);
  }

}
