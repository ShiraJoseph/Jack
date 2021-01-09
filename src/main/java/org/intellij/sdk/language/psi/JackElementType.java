package org.intellij.sdk.language.psi;

import org.intellij.sdk.language.JackLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JackElementType extends IElementType {
    public JackElementType(@NotNull @NonNls String debugName){
        super(debugName, JackLanguage.INSTANCE);
    }
}
