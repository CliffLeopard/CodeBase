package com.cleo.codebase.plugin.transform

import org.gradle.api.artifacts.transform.InputArtifact
import org.gradle.api.artifacts.transform.TransformAction
import org.gradle.api.artifacts.transform.TransformOutputs
import org.gradle.api.artifacts.transform.TransformParameters
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Provider
import java.io.File

/**
 * author:gaoguanling
 * date:2021/9/29
 * time:15:54
 * email:gaoguanling@360.cn
 * link:
 */
abstract class Unzip : TransformAction<TransformParameters.None> {
    @get:InputArtifact
    abstract val inputArtifact: Provider<FileSystemLocation>

    override
    fun transform(outputs: TransformOutputs) {
        val input = inputArtifact.get().asFile
        val unzipDir = outputs.dir(input.name)
        unzipTo(input, unzipDir)
    }

    private fun unzipTo(zipFile: File, unzipDir: File) {
        // implementation...
    }
}