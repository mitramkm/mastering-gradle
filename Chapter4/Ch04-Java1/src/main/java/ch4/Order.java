package ch4;


public class Order {
	
	private int orderNo;
	private Customer orderedBy;
	private String description;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Customer getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(Customer orderedBy) {
		this.orderedBy = orderedBy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderedBy=" + orderedBy
				+ ", description=" + description + "]";
	}

	
}
