package ch2


// Creating a List
List list1 = ['a','b','c','d']
def list2 = [3, 2, 1, 4, 5] as List

// Reading a List
println list1[1]     				// Output: b
println list2.get(4) 				// Output: 5
//println list1.get(5) 				// Throws java.lang.IndexOutOfBoundsException

// Some utility method on List
//Sort a List
println list2.sort()				// Output: [1, 2, 3, 4, 5] 
// Reserve a list
println list1.reverse() 			// Output: [d, c, b, a]
// Finding elements
println ("Max:" + list2.max() + ":Last:" + list1.last()) // Output: Max:5:Last:d

println list2.find({it %2 == 0})		// Output: 2
println list2.findAll({it %2 == 0})		// Output: [2, 4] 
