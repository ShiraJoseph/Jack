// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackIfFlow extends PsiElement {

  @NotNull
  JackCloseParenthesis getCloseParenthesis();

  @Nullable
  JackElseKeyword getElseKeyword();

  @NotNull
  JackIfKeyword getIfKeyword();

  @NotNull
  JackOpenParenthesis getOpenParenthesis();

  @NotNull
  List<JackCodeBlock> getCodeBlockList();

  @NotNull
  JackCondition getCondition();

}
