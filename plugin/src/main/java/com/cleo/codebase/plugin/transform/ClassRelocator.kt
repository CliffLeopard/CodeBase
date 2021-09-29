package com.cleo.codebase.plugin.transform

import org.gradle.api.artifacts.transform.*
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.CompileClasspath
import org.gradle.api.tasks.Input
import java.io.File

/**
 * author:gaoguanling
 * date:2021/9/27
 * time:17:37
 * email:gaoguanling@360.cn
 * link: 4
 */
@CacheableTransform
abstract class ClassRelocator : TransformAction<ClassRelocator.Parameters> {
    interface Parameters : TransformParameters {
        @get:CompileClasspath
        val externalClasspath: ConfigurableFileCollection

        @get:Input
        val excludedPackage: Property<String>
    }

    @get:Classpath
    @get:InputArtifact
    abstract val primaryInput: Provider<FileSystemLocation>

    @get:CompileClasspath
    @get:InputArtifactDependencies
    abstract val dependencies: FileCollection

    override
    fun transform(outputs: TransformOutputs) {
        val primaryInputFile = primaryInput.get().asFile
        if (parameters.externalClasspath.contains(primaryInputFile)) {
            outputs.file(primaryInput)
        } else {
            val baseName = primaryInputFile.name.substring(0, primaryInputFile.name.length - 4)
            relocateJar(outputs.file("$baseName-relocated.jar"))
        }
    }

    private fun relocateJar(output: File) {
        // implementation...
//        val relocatedPackages = (dependencies.flatMap { it.readPackages() } + primaryInput.get().asFile.readPackages()).toSet()
//        val nonRelocatedPackages = parameters.externalClasspath.flatMap { it.readPackages() }
//        val relocations = (relocatedPackages - nonRelocatedPackages).map { packageName ->
//            val toPackage = "relocated.$packageName"
//            println("$packageName -> $toPackage")
//            Relocation(packageName, toPackage)
//        }
//        JarRelocator(primaryInput.get().asFile, output, relocations).run()
    }
}