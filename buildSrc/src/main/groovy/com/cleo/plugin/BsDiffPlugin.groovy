package com.cleo.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class BsDiffPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.afterEvaluate {
            //只是定义任务，不会执行，执行还需要手动 ./gradlew bsDiff
            project.task(type: BsDiffTask, "bsDiffWrapper") {
                inputs.files "${project.rootDir.absolutePath}/temp/testold.txt", "${project.rootDir.absolutePath}/temp/testnew.txt"
                outputs.files "${project.rootDir.absolutePath}/temp/testdiff.patch"
            }
        }
    }
}

