package ch4

import org.gradle.api.*


class FilePlugin implements Plugin<Project> {
	void apply(Project project) {
		project.task('copy') << {
			println "Task copy is running"
			//....
		}
		project.task('move') << {
			println "Task move is running"
			//...
		}		
	}
}
