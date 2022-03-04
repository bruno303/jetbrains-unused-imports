package com.github.bruno303.jetbrainsunusedimports.services

import com.intellij.openapi.project.Project
import com.github.bruno303.jetbrainsunusedimports.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
