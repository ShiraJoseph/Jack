// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackFunction extends PsiElement {

  @NotNull
  JackCloseBrace getCloseBrace();

  @NotNull
  JackFunctionKeyword getFunctionKeyword();

  @NotNull
  JackOpenBrace getOpenBrace();

  @NotNull
  JackParameters getParameters();

  @NotNull
  JackReturnStatement getReturnStatement();

  @NotNull
  JackRoutineBlock getRoutineBlock();

  @NotNull
  JackType getType();

}
