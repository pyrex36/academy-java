package com.bptn.course._08_oop_demo;

class Customer {
	
	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	public Customer(String customerID, String customerName, String customerEmail) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public ShoppingCart getCart() {
		return this.cart;
	}
	public void checkout() {
		System.out.println("Processing order for " + customerName);
	}
}
