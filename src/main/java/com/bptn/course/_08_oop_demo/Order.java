package com.bptn.course._08_oop_demo;

class Order {
	
	private Customer customer;
	private CartItem[] items;
	private double totalAmount;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.items = customer.getCart().showProductInCart();
		
	}

}
