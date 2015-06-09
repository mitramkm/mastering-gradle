package ch2

/*
 * Range Example
 */

// Creating a range 
def range1 = 1..10
Range range2 = 'a'..'e'

// Reading from range
for(i in range2) println i

//From and To element
println (range1.getFrom() + "|" + range1.getTo())

range1.isReverse() // Output: false

range1.step(2) // Output: [1, 3, 5, 7, 9]