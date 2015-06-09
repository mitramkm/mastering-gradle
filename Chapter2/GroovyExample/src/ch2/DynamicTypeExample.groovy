package ch2

def var1
var1 ='a' 			// println var1, will print value as a
println var1.class 	// will print class java.lang.String
var1 = 1 			// println var1, will print value as 1
println var1.class 	// will print class java.lang.Integer
def method1() {/*method body*/}


def addition(a, b) { return a + b}

println addition (1, 2)
println addition ([1,2], [4, 5])
println addition('Hi ', 3)


p1 = new Person()
p2 = new Person()
println addition(p1, p2)
