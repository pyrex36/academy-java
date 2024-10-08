package com.bptn.course._14_array_list;

import java.util.List;
import java.util.ArrayList;

public class MoveSmallest {
	    public static void moveSmallest(ArrayList<Integer> list) {
	        if (list == null || list.size() <= 1) {
	            return; // No need to move if the list is null or has 1 or fewer elements
	        }

	        int smallestIndex = 0;
	        for (int i = 1; i < list.size(); i++) {
	            if (list.get(i) < list.get(smallestIndex)) {
	                smallestIndex = i;
	            }
	        }

	        // Move smallest to front
	        int smallestValue = list.remove(smallestIndex);
	        list.add(0, smallestValue);
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {3, 11, 54, 7, 1, 22};
	        for (int i = 0; i < nums.length; i++) {
	            values.add(nums[i]);
	        }
	        moveSmallest(values);
	        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
	        System.out.println("Your Result:\t\t " + values);
	    }
}
