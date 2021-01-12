// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackReturnStatement extends PsiElement {

  @NotNull
  JackReturnKeyword getReturnKeyword();

  @NotNull
  JackStatementTerminator getStatementTerminator();

  @Nullable
  JackRoutineCall getRoutineCall();

}
