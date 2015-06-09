package ch2

class Order {
	private int orderNo
	private Customer orderedByCustomer
	String description

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", description=" + description + "]";
	}

	static main(args) {
		Order order1 = new Order();
		order1.orderNo = 1;
		order1.orderedByCustomer = new Customer(name: "Customer1", email: "cust1@example.com", address: "US")
		order1.description = "Ordered by customer 1"
		
		Order order2 = new Order();
		order2.orderNo = 2;
		order2.orderedByCustomer = new Customer(name: "Customer2", email: "cust2@example.com", address: "US")
		order2.description = "Ordered by customer 2"
		
		List orderlist = [order1, order2]

		def builder = new groovy.xml.MarkupBuilder(new FileWriter("orders.xml"))  

		builder.orders{
			for(i in orderlist){
				order{
					no(i.orderNo)
					description(i.description)
					customer{
						name(firstname : i.orderedBy.name)
						email(i.orderedBy.email)
					}
				}
			}
		}

	}
}

class Customer{
	String name
	String email
	String address

	String showEmail(){
		email
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address="
		+ address + "]";
	}
}


