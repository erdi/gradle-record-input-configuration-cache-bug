package com.github.erdi.gradle.configuration.cache.bug

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.assign
import org.gradle.kotlin.dsl.register

class PluginWithTaskUsingRecordAsInput : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register<TaskUsingRecordAsInput>("taskUsingRecordAsInput") {
            inputRecord = InputRecord("foo")
        }
    }
}