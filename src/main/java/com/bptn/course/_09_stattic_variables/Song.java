package com.bptn.course._09_stattic_variables;

public class Song {

		  // Static variable to count how many times the verse method is called
		  private static int verseCounter = 0;

		  // Update the method to increment the counter
		  public static void verse(String animal, String noise) {
		    System.out.println("Old MacDonald had a farm");
		    System.out.println("E-I-E-I-O");
		    System.out.println("And on that farm he had a " + animal);
		    System.out.println("E-I-E-I-O");
		    System.out.println("With a " + noise + "-" + noise + " here");
		    System.out.println("And a " + noise + "-" + noise + " there");
		    System.out.println("Here a " + noise + ", there a " + noise);
		    System.out.println("Everywhere a " + noise + "-" + noise);
		    System.out.println("Old MacDonald had a farm");
		    System.out.println("E-I-E-I-O");

		    // Increment the counter value
		    verseCounter++;
		  }

		  public static void main(String[] args) {
		    verse("cow", "moo");
		    verse("duck", "quack");
		    verse("pig", "oink");
		    verse("chicken", "cluck");

		    // Print the counter value
		    System.out.println("Verse method was called " + verseCounter + " times.");
		  }
		

}
