package org.intellij.sdk.language.psi;

import org.intellij.sdk.language.JackLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JackTokenType extends IElementType {
    public JackTokenType(@NotNull @NonNls String debugName){
        super(debugName, JackLanguage.INSTANCE);
    }

    @Override
    public String toString(){
        return "JackTokenType." + super.toString();
    }
}
