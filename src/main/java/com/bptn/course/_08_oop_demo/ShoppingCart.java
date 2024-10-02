package com.bptn.course._08_oop_demo;

class ShoppingCart {
	
	private CartItem[] items;
	private int itemCount;
	
	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}
// add product to cart	
	public void addProductToCart(Product product, int quantity) {
		CartItem newItem = new CartItem(product, quantity);
		if(itemCount <= 4) {
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock(quantity);
	} else {
		throw new IllegalArgumentException("Cart full");
		}	
	}
// show products in cart
	public CartItem[] getItems() {
		CartItem[] currentItems = new CartItem[itemCount];
		for(int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
}
