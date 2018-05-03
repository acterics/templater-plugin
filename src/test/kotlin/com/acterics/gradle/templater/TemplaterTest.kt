package com.acterics.gradle.templater

class TemplaterTest {
    
    @Test
    fun createTemplateTaskTest() {
        val project = ProjectBuilder.builder().build()
        val task = project.task('create_template', type = CreateTemplateTask::class.java)
    }
}