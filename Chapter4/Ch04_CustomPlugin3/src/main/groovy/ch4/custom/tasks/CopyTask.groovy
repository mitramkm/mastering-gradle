package ch4.custom.tasks

import org.gradle.api.tasks.TaskAction

class CopyTask extends AbstractTask {
	
	@TaskAction
	def action1() {
		println "Copy Task Running"
	}
}
