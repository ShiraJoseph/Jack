
package org.intellij.sdk.language;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.sdk.language.psi.JackFile;
import org.intellij.sdk.language.psi.JackProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JackUtil {

    /**
     * Searches the entire project for Jack language files with instances of the Jack property with the given key.
     *
     * @param project current project
     * @param key     to check
     * @return matching properties
     */
    public static List<JackProperty> findProperties(Project project, String key) {
        List<JackProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(JackFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JackFile simpleFile = (JackFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                JackProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JackProperty.class);
                if (properties != null) {
                    for (JackProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<JackProperty> findProperties(Project project) {
        List<JackProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(JackFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JackFile simpleFile = (JackFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                JackProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JackProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

}
