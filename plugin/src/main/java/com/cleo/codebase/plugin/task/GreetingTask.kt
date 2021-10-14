package com.cleo.codebase.plugin.task

/**
 * author:gaoguanling
 * date:2021/9/27
 * time:17:53
 * email:gaoguanling@360.cn
 * link:
 */
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class GreetingTask : DefaultTask() {
    @Input
    val greeting: String = "hello from GreetingTask"

    @TaskAction
    fun greet() {
        println(greeting)
    }
}