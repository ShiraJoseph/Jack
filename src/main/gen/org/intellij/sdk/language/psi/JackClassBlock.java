// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackClassBlock extends PsiElement {

  @NotNull
  JackClassKeyword getClassKeyword();

  @NotNull
  JackCloseBrace getCloseBrace();

  @NotNull
  JackOpenBrace getOpenBrace();

  @Nullable
  JackConstructor getConstructor();

  @NotNull
  List<JackDeclaration> getDeclarationList();

  @NotNull
  List<JackRoutine> getRoutineList();

  @NotNull
  JackUserClassType getUserClassType();

}
