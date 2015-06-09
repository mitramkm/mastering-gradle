package ch2

// Creating a Set
def Set1 = [1,2,1,4,5,9] as Set
Set Set2 = new HashSet( ['a','b','c','d'] )

// Modifying a Set
Set2.add(1)
Set2.add(9)
//Set2.add(null)
Set2.addAll([4,5]) 				// Set2: [1, d, 4, b, 5, c, a, 9]
println Set2
Set2.remove(1) 			
Set2.removeAll([4,5])			// Set2: [d, b, c, a, 9]	
println Set2
// Union of Set
Set Union = Set1 + Set2 		// Union: [1, 2, 4, 5, 9, d, b, c, a] 
println Union 

// Intersection of Set
Set intersection = Set1.intersect(Set2) 	// Intersection: [9]
println intersection

// Complement of Set
Set Complement = Union.minus(Set1) 			// Complement: [d, b, c, a]
println Complement









