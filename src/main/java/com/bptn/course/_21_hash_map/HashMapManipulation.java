package com.bptn.course._21_hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
	    public static void main(String[] args) {
	        // Create a HashMap object
	        HashMap<String, Integer> map = new HashMap<>();

	        // Add key-value pairs to the map
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        // Print the size of the map
	        System.out.println("Size of map: " + map.size());

	        // Print key-value pairs in the map
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Get the value of the key 'A'
	        Integer value = map.get("A");
	        System.out.println("Value of key 'A': " + value);

	        // Add a new key-value pair to the map
	        map.put("D", 4);

	        // Print key-value pairs again to show the added key-value pair
            System.out.println("Map after adding a new key-value pair:");

	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Check if the key 'C' exists in the map
	        if (map.containsKey("C")) {
	            System.out.println("Key 'C' exists in the map");
	        } else {
	            System.out.println("Key 'C' does not exist in the map");
	        }
	    }
}
