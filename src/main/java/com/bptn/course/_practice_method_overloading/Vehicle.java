package com.bptn.course._practice_method_overloading;

public class Vehicle {
	
	 private String color;
	    private String brand;

	    // Parameterized constructor
	    public Vehicle(String color, String brand) {
	        this.color = color;
	        this.brand = brand;
	    }

	    // Print method
	    public void print() {  
	    	   System.out.println(this.color + " " + this.brand); 
	    	}
	    

	    // Main method to test the class
	    public static void main(String[] args) {
	        Vehicle myCar = new Vehicle("White", "Audi");
	        myCar.print();
	    }

}
