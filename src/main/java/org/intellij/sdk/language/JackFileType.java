package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JackFileType extends LanguageFileType {

    public static final JackFileType INSTANCE = new JackFileType();

    private JackFileType() {
        super(JackLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Jack File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Jack language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jack";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return JackIcons.FILE;
    }

}
