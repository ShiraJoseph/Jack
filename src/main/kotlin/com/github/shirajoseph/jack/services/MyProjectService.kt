package com.github.shirajoseph.jack.services

import com.intellij.openapi.project.Project
import com.github.shirajoseph.jack.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
