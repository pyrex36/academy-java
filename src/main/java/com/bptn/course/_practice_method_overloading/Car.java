package com.bptn.course._practice_method_overloading;

public class Car extends Vehicle {
	// Declare String steeringwheel
	 private String steeringWheel;

	    // Parameterized constructor
	    public Car(String color, String brand, String steeringWheel) {
	        // Call the parent class constructor
	        super(color, brand);
	        this.steeringWheel = steeringWheel;
	    }

	    // Print method
	    @Override
	    public void print() {
	        // Call the parent class print method
	        super.print();
	    }

}
