package com.github.faroqar.templatemiyzan.services

import com.intellij.openapi.project.Project
import com.github.faroqar.templatemiyzan.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
