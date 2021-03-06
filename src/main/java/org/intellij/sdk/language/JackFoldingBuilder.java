// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.sdk.language.psi.JackProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JackFoldingBuilder extends FoldingBuilderEx implements DumbAware {

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        // Initialize the group of folding regions that will expand/collapse together.
        FoldingGroup group = FoldingGroup.newGroup(JackAnnotator.JACK_PREFIX_STR);
        // Initialize the list of folding regions
        List<FoldingDescriptor> descriptors = new ArrayList<>();
        // Get a collection of the literal expressions in the document below root
        Collection<PsiLiteralExpression> literalExpressions =
                PsiTreeUtil.findChildrenOfType(root, PsiLiteralExpression.class);
        // Evaluate the collection
        for (final PsiLiteralExpression literalExpression : literalExpressions) {
            String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
            if (value != null && value.startsWith(JackAnnotator.JACK_PREFIX_STR + JackAnnotator.JACK_SEPARATOR_STR)) {
                Project project = literalExpression.getProject();
                String key = value.substring(
                        JackAnnotator.JACK_PREFIX_STR.length() + JackAnnotator.JACK_SEPARATOR_STR.length()
                );
                // Get a list of all properties for a given key in the project
                final List<JackProperty> properties = JackUtil.findProperties(project, key);
                if (properties.size() == 1) {
                    // Add a folding descriptor for the literal expression at this node.
                    descriptors.add(new FoldingDescriptor(literalExpression.getNode(),
                            new TextRange(literalExpression.getTextRange().getStartOffset() + 1,
                                    literalExpression.getTextRange().getEndOffset() - 1),
                            group));
                }
            }
        }
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    /**
     * Gets the Jack Language 'value' string corresponding to the 'key'
     *
     * @param node Node corresponding to PsiLiteralExpression containing a string in the format
     *             JACK_PREFIX_STR + JACK_SEPARATOR_STR + Key, where Key is
     *             defined by the Jack language file.
     */
    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        String retTxt = "...";
        if (node.getPsi() instanceof PsiLiteralExpression) {
            PsiLiteralExpression nodeElement = (PsiLiteralExpression) node.getPsi();
            String key = ((String) nodeElement.getValue()).substring(
                    JackAnnotator.JACK_PREFIX_STR.length() + JackAnnotator.JACK_SEPARATOR_STR.length()
            );
            final List<JackProperty> properties = JackUtil.findProperties(nodeElement.getProject(), key);
            String place = properties.get(0).getValue();
            // IMPORTANT: keys can come with no values, so a test for null is needed
            // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
            // like it has LF embedded in it and embedded " to escaped "
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        return retTxt;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }

}
