package com.bptn.course._09_stattic_variables;

public class TemperatureBug {

	

	   private static double temperature;
	   public static double maxTemp = 0;

	   public TemperatureBug(double t) {
	        temperature = t;
	        if (t > maxTemp)
	            maxTemp = t;
	   }
	   public static void printMax() {
		     System.out.println(temperature);
		  }
	   
	   public static void main(String[] args) {
	        Temperature t1 = new Temperature(75);
	        Temperature t2 = new Temperature(100);
	        Temperature t3 = new Temperature(65);
	        System.out.println("Max Temp: " + Temperature.maxTemp);
	   }
	 
}
