package ch3

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SampleTask extends DefaultTask {
	String systemName = "DefaultMachineName"
	String systemGroup = "DefaultSystemGroup"
	@TaskAction
	def action1() {
		println "System Name is "+systemName+" and group is "+systemGroup
	}
	@TaskAction
	def action2() {
		println 'Adding multiple actions for refactoring'
	}

}
