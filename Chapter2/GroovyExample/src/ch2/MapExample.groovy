package ch2

//Map m1 = [name:"Groovy"]
String s1 = "name"
Map m1 = [(s1):"Groovy"]
println m1.get("name")

def m2 = [id:1,title:"Mastering Groovy" ] as Map

println m2.get("id") 
println m2["id"]

Map ageMap = [John:24, Meera:28,Kat:31,Lee:19,Harry:18]

ageMap.each {key, value ->
	println "Name is "+key
	println "Age is " + value
}

ageMap.each {entry  ->
	println "Name is "+entry.key
	println "Age is " + entry.value
}
	
	