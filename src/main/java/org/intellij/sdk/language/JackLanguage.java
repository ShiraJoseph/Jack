package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class JackLanguage extends Language {
    public static final JackLanguage INSTANCE = new JackLanguage();

    private JackLanguage() {
        super("Jack");
    }
}
