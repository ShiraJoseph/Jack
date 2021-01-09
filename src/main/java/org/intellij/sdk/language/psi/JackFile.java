package org.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.language.JackFileType;
import org.intellij.sdk.language.JackLanguage;
import org.jetbrains.annotations.NotNull;

public class JackFile extends PsiFileBase {
    public JackFile(@NotNull FileViewProvider viewProvider){
        super(viewProvider, JackLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JackFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Jack File";
    }
}
