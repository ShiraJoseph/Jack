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

public class JackOSClassTypeImpl extends ASTWrapperPsiElement implements JackOSClassType {

  public JackOSClassTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JackVisitor visitor) {
    visitor.visitOSClassType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JackVisitor) accept((JackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JackArrayClass getArrayClass() {
    return findChildByClass(JackArrayClass.class);
  }

  @Override
  @Nullable
  public JackKeyboardClass getKeyboardClass() {
    return findChildByClass(JackKeyboardClass.class);
  }

  @Override
  @Nullable
  public JackMathClass getMathClass() {
    return findChildByClass(JackMathClass.class);
  }

  @Override
  @Nullable
  public JackMemoryClass getMemoryClass() {
    return findChildByClass(JackMemoryClass.class);
  }

  @Override
  @Nullable
  public JackOutputClass getOutputClass() {
    return findChildByClass(JackOutputClass.class);
  }

  @Override
  @Nullable
  public JackScreenClass getScreenClass() {
    return findChildByClass(JackScreenClass.class);
  }

  @Override
  @Nullable
  public JackStringClass getStringClass() {
    return findChildByClass(JackStringClass.class);
  }

  @Override
  @Nullable
  public JackSysClass getSysClass() {
    return findChildByClass(JackSysClass.class);
  }

}
