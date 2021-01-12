// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import org.intellij.sdk.language.JackFileType;

public class JackElementFactory {

    public static JackProperty createProperty(Project project, String name) {
        final JackFile file = createFile(project, name);
        return (JackProperty) file.getFirstChild();
    }

    public static JackFile createFile(Project project, String text) {
        String name = "dummy.jack";
        return (JackFile) PsiFileFactory.getInstance(project).createFileFromText(name, JackFileType.INSTANCE, text);
    }

    public static JackProperty createProperty(Project project, String name, String value) {
        final JackFile file = createFile(project, name + " = " + value);
        return (JackProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final JackFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

}