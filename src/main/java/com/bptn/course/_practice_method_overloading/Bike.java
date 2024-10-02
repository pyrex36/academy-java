package com.bptn.course._practice_method_overloading;

public class Bike extends Vehicle {

	 private String bikeHandle;

	    // Parameterized constructor
	    public Bike(String color, String brand, String bikeHandle) {
	        // Call the parent class constructor
	        super(color, brand);
	        this.bikeHandle = bikeHandle;
	    }

	    // Print method
	    public void print() {
	        // Call the parent class print method
	        super.print();
	        System.out.println("Bike Handle: " + bikeHandle);
	    }
	    
	
	    }
//}
