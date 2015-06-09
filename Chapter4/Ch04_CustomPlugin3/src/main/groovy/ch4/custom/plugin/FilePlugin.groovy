package ch4.custom.plugin


import org.gradle.api.Plugin
import org.gradle.api.Project
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch4.custom.tasks.CopyTask
import ch4.custom.tasks.MoveTask

class FilePlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {
		
		def extension = project.extensions.create("filePluginExtension", FilePluginRootExtension)
	
		project.tasks.create("copy", CopyTask.class)
		project.tasks.create("move", MoveTask.class)
		project.task('customTask') << {
			println "Source file is "+project.filePluginExtension.sourceFile
		}
	}

}
