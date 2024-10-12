package com.bptn.course._bigcode_week301;

import java.util.HashMap;
import java.util.Map;

public class Store {

	 private Map<String, Integer> products;

	    // No-arg constructor
	    public Store() {
	        products = new HashMap<>();
	        products.put("apple", 10);
	        products.put("banana", 5);
	        products.put("orange", 0);
	    }
	 // purchase method
	    public void purchase(String product, int quantity) throws OutOfStockException {
	        if (!products.containsKey(product)) {
	            throw new OutOfStockException("Product " + product + " not available in store");
	        }

	        int availableQuantity = products.get(product);
	        if (quantity > availableQuantity) {
	            throw new OutOfStockException("Not enough " + product + " in stock. Available: " + availableQuantity);
	        }

	        products.put(product, availableQuantity - quantity);
	        System.out.println("Purchased " + quantity + " " + product + "(s).");
	    }

}
