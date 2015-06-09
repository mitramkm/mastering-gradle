package ch2


class Person{
	String name

	@Override
	public String toString() {
		return "Person [name=" + name +"]";
	}
	
//	def plus(Person that){
//		return "Plus method"
//	}
	
	def methodMissing(String name, args) {
		if (name.startsWith("plus") ) {
			// write your own implementation
			return "plus method intercepted"
		} else {
			println "Method name does not start with plus"
			throw new MissingMethodException(name, this.class, args)
		}
	}
	
}
