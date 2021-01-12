// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackRoutineCall extends PsiElement {

  @NotNull
  JackClassMembership getClassMembership();

  @NotNull
  JackCloseParenthesis getCloseParenthesis();

  @NotNull
  JackOpenParenthesis getOpenParenthesis();

  @Nullable
  JackObjectType getObjectType();

  @NotNull
  List<JackRoutineCall> getRoutineCallList();

  @NotNull
  JackRoutineName getRoutineName();

}
