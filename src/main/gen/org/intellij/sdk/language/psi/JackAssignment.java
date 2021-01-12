// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackAssignment extends PsiElement {

  @NotNull
  JackAssignmentOperator getAssignmentOperator();

  @NotNull
  JackLetKeyword getLetKeyword();

  @NotNull
  JackStatementTerminator getStatementTerminator();

  @Nullable
  JackRoutineCall getRoutineCall();

}