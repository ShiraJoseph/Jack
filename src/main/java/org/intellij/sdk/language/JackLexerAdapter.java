package org.intellij.sdk.language;
import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class JackLexerAdapter extends FlexAdapter {
    public JackLexerAdapter() {
        super(new JackLexer(null));
    }
}
