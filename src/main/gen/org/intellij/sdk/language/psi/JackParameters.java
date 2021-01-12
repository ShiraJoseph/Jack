// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JackParameters extends PsiElement {

  @NotNull
  JackCloseParenthesis getCloseParenthesis();

  @NotNull
  List<JackListSeparator> getListSeparatorList();

  @NotNull
  JackOpenParenthesis getOpenParenthesis();

  @NotNull
  List<JackParameter> getParameterList();

}
