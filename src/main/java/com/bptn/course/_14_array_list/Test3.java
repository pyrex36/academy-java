package com.bptn.course._14_array_list;

import java.util.List;
import java.util.ArrayList;

public class Test3 {
	    public static void moveSmallest(ArrayList<Integer> list) {
	        int smallestIndex = 0;
	        for (int i = 1; i < list.size(); i++) {
	            if (list.get(i) < list.get(smallestIndex)) {
	                smallestIndex = i;
	            }
	        }
	        //move smallest to front
	        int smallestValue = list.remove(smallestIndex);
	        list.add(0, smallestValue);
	    }

	    public static void main(String[] args) {
	        //instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {3, 11, 54, 7, 1, 22};
	        for (int i = 0; i < nums.length; i ++) {
	            values.add(nums[i]);
	        }
	        moveSmallest(values);
	        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
	        System.out.println("Your Result: " + values);
	    }


}
