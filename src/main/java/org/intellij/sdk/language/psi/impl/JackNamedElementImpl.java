package org.intellij.sdk.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.JackNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class JackNamedElementImpl extends ASTWrapperPsiElement implements JackNamedElement {
    public JackNamedElementImpl(@NotNull ASTNode node){
        super(node);
    }
}
