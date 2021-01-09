package org.intellij.sdk.language.services

import com.intellij.openapi.project.Project
import org.intellij.sdk.language.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
