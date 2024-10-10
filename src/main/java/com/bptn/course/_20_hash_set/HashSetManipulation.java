package com.bptn.course._20_hash_set;

import java.util.HashSet;

public class HashSetManipulation {
	    public static void main(String[] args) {
	        // Create a new HashSet
	        HashSet<String> set = new HashSet<>();

	        // Populate the set with initial values
	        set.add("A");
	        set.add("B");
	        set.add("C");

	        // Print the size of the set
	        System.out.println("Size set: " + set.size());

	        // Print the values in the set
	        for (String value : set) {
	            System.out.println("Value: " + value);
	        }

	        // Add a new value to the set
	        set.add("D");
	        System.out.println("Set after using add(): ");
	        for (String value : set) {
	            System.out.println("Value: " + value);
	        }

	        // Remove value 'A' from the set
	        set.remove("A");
	        System.out.println("Set after using remove(): ");
	        for (String value : set) {
	            System.out.println("Value: " + value);
	        }

	        // Check if the value 'C' exists in the set
	        if (set.contains("C")) {
	            System.out.println("Value 'C' exists in the set.");
	        } else {
	            System.out.println("Value 'C' does not exist in the set.");
	        }
	    }
}
