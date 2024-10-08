package com.bptn.course._14_array_list;

import java.util.List;
	import java.util.ArrayList;

public class Test5 {
	
	    public static int sumNegValues(ArrayList<Integer> list) {
	        int sum = 0;
	        for (int num : list) {
	            if (num < 0) {
	                sum += num;
	            }
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {-2, 34, -11, 9, -6, 3};
	        for (int num : nums) {
	            values.add(num);
	        }
	        System.out.println("Expected Result:\t -19");
	        System.out.print("Your Result:\t\t ");
	        System.out.println(sumNegValues(values));
	    }

}
