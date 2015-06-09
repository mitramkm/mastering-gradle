package ch2

def closure1 = { println "hello!" }
groovy.lang.Closure closure2 = { println it }
closure1()								// Output: hello!
closure2("This will be printed")		// Output: This will be printed
def sum = { a, b ->  a+b }
println sum( 1, 7 ) 					// Output: 8




def addTwo = {it+2 }	
println addTwo(2)						// Output: 4
//println addTwo()						// NullPointerException

int constantValue = 9
def addOne = { Integer a -> constantValue + a }
println addOne(1)						// Output: 10
println addOne.call(1)					// Output: 10


// Delegate Example

class PrintValue{
	def myValue = "I'm owner"
	def printClosure = {
		println myValue
	}
}

class PrintHandler{
	def myValue = "I'm Defined Here"
}

def pcl = new PrintValue().printClosure
pcl.resolveStrategy = Closure.DELEGATE_FIRST
pcl.delegate = new PrintHandler()
pcl()


	