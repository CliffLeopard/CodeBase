package com.cleo.codebase.plugin

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
 * time:14:47
 * email:gaoguanling@360.cn
 * link:
 */
abstract class CodeTransformAction : TransformAction<TransformParameters.None> {
    @InputArtifact
    abstract fun getInputArtifact(): Provider<FileSystemLocation?>?

    override fun transform(outputs: TransformOutputs) {
        val input: File = getInputArtifact()!!.get()!!.asFile
        val output: File = outputs.file(input.name.toString() + ".transformed")
    }
}