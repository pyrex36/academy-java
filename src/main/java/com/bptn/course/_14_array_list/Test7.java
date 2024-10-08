package com.bptn.course._14_array_list;

import java.util.List;
	import java.util.ArrayList;

public class Test7 {
	    public static void shiftLeftOne(ArrayList<Integer> list) {
	        if (list == null || list.size() <= 1) {
	            return; // No need to shift if the list is null or has 1 or fewer elements
	        }
	        
	        // Store the first element
	        int firstElement = list.get(0);
	        
	        // Shift all elements to the left by one position
	        for (int i = 1; i < list.size(); i++) {
	            list.set(i - 1, list.get(i));
	        }
	        
	        // Place the first element at the end of the list
	        list.set(list.size() - 1, firstElement);
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {1, 2, 3, 4, 5};
	        for (int i = 0; i < nums.length; i++) {
	            values.add(nums[i]);
	        }
	        shiftLeftOne(values);
	        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
	        System.out.println("Your Result:\t\t " + values);
	    }
}
