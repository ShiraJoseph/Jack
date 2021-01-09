// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface JackTypes {

  IElementType PROPERTY = new JackElementType("PROPERTY");

  IElementType COMMENT = new JackTokenType("COMMENT");
  IElementType CRLF = new JackTokenType("CRLF");
  IElementType KEY = new JackTokenType("KEY");
  IElementType SEPARATOR = new JackTokenType("SEPARATOR");
  IElementType VALUE = new JackTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new JackPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
