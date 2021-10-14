package com.cleo.codebase.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

/**
 * author:gaoguanling
 * date:2021/9/27
 * time:18:22
 * email:gaoguanling@360.cn
 * link:
 */
class UrlVerify : DefaultTask() {
    private var url: String? = null

    @Option(option = "url", description = "Configures the URL to be verified.")
    fun setUrl(url: String?) {
        this.url = url
    }

    @Input
    fun getUrl(): String? {
        return url
    }

    @TaskAction
    fun verify() {
        logger.quiet("Verifying URL '{}'", url)
        // verify URL by making a HTTP call
    }
}