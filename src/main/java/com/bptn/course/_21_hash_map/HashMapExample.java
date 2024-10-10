package com.bptn.course._21_hash_map;

import java.util.HashMap;

public class HashMapExample {
	    public static void main(String[] args) {
	        // Instantiate HashMap and try to use some of the methods listed above.
	        HashMap<String, Integer> myMap = new HashMap<>();
	        // Inserts an entry into the Map.
	        myMap.put("south", 3249);
	        myMap.put("north", 1999);
	        myMap.put("east", 1872);
	        myMap.put("west", 9049);
	        System.out.println(myMap);

	        // Returns true if the map is empty, or false if it contains at least one key.
	        boolean empty = myMap.isEmpty();
	        System.out.println("Is empty: " + empty);

	        // Deletes the entry for the specified key, thereby removing both the key and value.
	        myMap.remove("west");
	        System.out.println("After remove('west'): " + myMap);

	        // This method returns true if the provided value is 
	        //equal to a value that exists within the Map. Otherwise, it returns false.
	        boolean containsValue = myMap.containsValue(3249);
	        System.out.println("Contains value 3249: " + containsValue);

	        // This method returns true if the provided key is equal to 
	        //a key that exists within the Map. Otherwise, it returns false.
	        boolean containsKey = myMap.containsKey("east");
	        System.out.println("Contains key 'east': " + containsKey);

	        // Returns the value associated with the provided key.
	        Integer value = myMap.get("north");
	        System.out.println("Get value for key 'north': " + value);

	        // Replaces the specified value at the specified key.
	        myMap.replace("east", 7744);
	        System.out.println("After replace('east'): " + myMap);

	        // Returns the number of entries in the map.
	        int size = myMap.size();
	        System.out.println("Size of map: " + size);

	    }	
}
