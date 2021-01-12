// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackWhileFlow extends PsiElement {

  @NotNull
  JackCloseParenthesis getCloseParenthesis();

  @NotNull
  JackOpenParenthesis getOpenParenthesis();

  @NotNull
  JackWhileKeyword getWhileKeyword();

  @NotNull
  JackCodeBlock getCodeBlock();

  @NotNull
  JackCondition getCondition();

}
