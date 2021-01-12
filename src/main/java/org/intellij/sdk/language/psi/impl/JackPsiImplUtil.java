package org.intellij.sdk.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.intellij.sdk.language.JackIcons;
import org.intellij.sdk.language.psi.JackElementFactory;
import org.intellij.sdk.language.psi.JackProperty;
import org.intellij.sdk.language.psi.JackTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JackPsiImplUtil {
    public static String getKey(JackProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(JackTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to Jack spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(JackProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(JackTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(JackProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(JackProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(JackTypes.KEY);
        if (keyNode != null) {
            JackProperty property = JackElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(JackProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(JackTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final JackProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return JackIcons.FILE;
            }
        };
    }
}
