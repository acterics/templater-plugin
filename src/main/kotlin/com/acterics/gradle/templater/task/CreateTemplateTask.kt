package com.acterics.gradle.templater.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option;

class CreateTemplate: DefaultTask {

    var name: String
        @Option(option = 'name', description = 'Template prefix')
        set()
        @Input
        get()

    @TaskAction
    fun run() {
        getLogger().quiet("Creating template ${name}")
    }

   
}