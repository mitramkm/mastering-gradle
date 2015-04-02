package ch4.custom.tasks

import org.gradle.api.tasks.TaskAction

class MoveTask extends AbstractTask {
	
	@TaskAction
	def action1() {
		println "Move Task Running"
	}

}
