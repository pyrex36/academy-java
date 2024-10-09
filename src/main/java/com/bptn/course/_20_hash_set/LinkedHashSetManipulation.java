package com.bptn.course._20_hash_set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetManipulation {
	    public static void main(String[] args) {
	        // Create a LinkedHashSet and populate it with the elements A, B and C.
	        LinkedHashSet<String> set = new LinkedHashSet<>();
	        set.add("A");
	        set.add("B");
	        set.add("C");

	        // Print the size of the set
	        System.out.println("Size of the set: " + set.size());

	        // Use for each loop to print the elements in the set
	        System.out.println("Elements in the set using for-each loop:");
	        for (String element : set) {
	            System.out.println("Element: " +element);
	        }

	        // Use iterator to print the elements in the set
	        System.out.println("Elements in the set using iterator:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println("Element: " +iterator.next());
	        }

	        // Use remove() method to remove the element A from the set
	        set.remove("A");
	        System.out.println("Set after removing element A: " + set);

	        // Use contains() method to check if the element B exists in the set
	        if (set.contains("B")) {
	        	System.out.println("Element ‘B’ exists in the set");
	        }else {
	        	System.out.println("Element ‘B’ does not exists in the set");

	        }
//	        boolean containsB = set.contains("B");
//	        System.out.println("Does the set contain element B? " + containsB);

	        // Use clear() method to remove all elements from the set
	        set.clear();
	        System.out.println("Set after using clear(): " + set);
	    }
}
