package com.github.erdi.gradle.configuration.cache.bug

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

abstract class TaskUsingRecordAsInput : DefaultTask() {
    @get:Input
    abstract val inputRecord: Property<InputRecord>
}