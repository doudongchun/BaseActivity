package com.github.doudongchun.baseactivity.services

import com.intellij.openapi.project.Project
import com.github.doudongchun.baseactivity.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
