package com.bptn.course._practice;

import java.util.HashMap;
import java.util.Map;

public class CodeChallenge {

	
	    public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> numMap = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) {
	                return new int[] { numMap.get(complement), i };
	            }
	            numMap.put(nums[i], i);
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
 	public static void main(String[] args) {
		
		int [] nums = {1, 2, 7, 7};
		int target = 9;
	}
}
