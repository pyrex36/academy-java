package com.bptn.course._20_hash_set;

import java.util.TreeSet;

public class TreeSetManipulation {
	    public static void main(String[] args) {
	        // Create a TreeSet and populate it with the elements A, B and C.
	        TreeSet<String> set = new TreeSet<>();
	        set.add("A");
	        set.add("B");
	        set.add("C");

	        // Print the size of the set
	        System.out.println("Size of the set: " + set.size());

	        // Print the elements in the set
	        System.out.println("Elements in the set: " + set);

	        // Use the first() method to get the first element in the set, then print it out.
	        System.out.println("First element: " + set.first());

	        // Use the last() method to get the last element in the set, then print it out.
	        System.out.println("Last element: " + set.last());

	        // Use the headSet() method to get the elements in the set that are strictly less than the element B.
	        System.out.println("Elements less than B: " + set.headSet("B"));

	        // Use the tailSet() method to get the elements in the set that are greater than or equal to B.
	        System.out.println("Elements greater than or equal to B: " + set.tailSet("B"));

	        // Use subSet() method to get the elements in the set that are greater than or equal to a lower bound and less than an upper bound. In this case, the elements between A (inclusive) and C (exclusive).
	        System.out.println("Elements between A (inclusive) and C (exclusive): " + set.subSet("A", "C"));

	        // Use contains() method to check if B exists in the set.
	        System.out.println("Set contains B: " + set.contains("B"));

	        // Use remove() method to remove B from the set.
	        set.remove("B");

	        // Print the set to show that the element B has been removed.
	        System.out.println("Elements in the set after removing B: " + set);
	    }
}
