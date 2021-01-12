// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackDeclaration extends PsiElement {

  @NotNull
  List<JackListSeparator> getListSeparatorList();

  @NotNull
  JackStatementTerminator getStatementTerminator();

  @NotNull
  JackVarKeyword getVarKeyword();

  @NotNull
  JackType getType();

}
