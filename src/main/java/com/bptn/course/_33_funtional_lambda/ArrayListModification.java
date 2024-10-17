package com.bptn.course._33_funtional_lambda;
	
	import java.util.ArrayList;

	public class ArrayListModification {
	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> languages = new ArrayList<>();
	        
	        // Add elements to the ArrayList
	        languages.add("java");
	        languages.add("javascript");
	        languages.add("swift");
	        languages.add("python");
	        
	        // Print the original ArrayList
	        System.out.println("Original ArrayList:");
	        languages.forEach(language -> System.out.println(language));
	        
	        // Modify all elements to uppercase using replaceAll()
	        languages.replaceAll(String::toUpperCase);
	        
	        // Print the updated ArrayList
	        System.out.println("\nUpdated ArrayList:");
	        languages.forEach(language -> System.out.println(language));
	    }
}
