package ch2

import java.lang.invoke.SwitchPoint;
import java.security.cert.X509Certificate;

println("Hello Loop Example")

def condition1 = true
int condition2 = 1
if(condition1){
	println("Condition 1 satisfied")
	if(condition2){
		println("Condition 2 satisfied")
	}else{
		println("Condition 2 failed")
	}
}else{
	println("Condition 2 failed")
}

condition2 >= 0? println("Positive") : println("Negative")

String input = "Hello"

switch(input){		
	case [3, 4, 5] : println("Array Matched"); break;	
	case 10..15: println("Range Matched"); break;	
	case Integer : println("Integer Matched"); break;
	case ~/\w+/ : println("Pattern Matched"); break;	
	case String : println("String Matched"); break;		
	default:  println("Nothing Matched"); break;
}


for(int i = 0; i< 3; i++){
	println(i)
}

// Loop over a Range
for(i in 1..5) println(i)
// Array iteration
def arr = ["Apple", "Banana", "Mango"]
for(i in arr) println(i)
// for applied to Set
for(i in ([10,10,11,11,12,12] as Set)) println(i)


// While loop
int count = 0
while(count < 5) {
	println count++
}


def sum(z, x=10,y=1) {println x + " "+ z; x+y+z}
// z = 1
println sum(1)
// z = 2, x= 1
println sum(1, 2)
