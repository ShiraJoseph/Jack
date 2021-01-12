// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackCondition extends PsiElement {

  @NotNull
  List<JackAndOperator> getAndOperatorList();

  @NotNull
  List<JackOrOperator> getOrOperatorList();

  @NotNull
  JackComparison getComparison();

  @NotNull
  List<JackCondition> getConditionList();

}
