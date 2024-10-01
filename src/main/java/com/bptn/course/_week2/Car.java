package com.bptn.course._week2;

public class Car {
	 
	    String color;
	    String brand; 
	    int price; 
	    
	    Car(String color, String brand, int price){
	    	this.color = color;
	    	this.brand = brand;
	    	this.price = price;
	    } 
	    
	    Define printCarDetails { 
	      System.out.println(color + " " + brand + " " + price); 
	    }

	}  

	Class Main{ 
	    public static void main(String args[]) {
	        Car car1 = new Car("white", "BMW", 70000);                                
	        car1.printCarDetails();
	   } 
	}


