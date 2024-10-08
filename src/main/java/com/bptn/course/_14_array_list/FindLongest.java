package com.bptn.course._14_array_list;

import java.util.List;
	import java.util.ArrayList;

public class FindLongest {
	    public static String findLongest(ArrayList<String> list) {
	        if (list == null || list.isEmpty()) {
	            return null; // Return null if the list is null or empty
	        }

	        String longest = list.get(0);
	        for (String str : list) {
	            if (str.length() > longest.length()) {
	                longest = str;
	            }
	        }
	        return longest;
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Strings
	        ArrayList<String> values = new ArrayList<String>();
	        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
	        for (int i = 0; i < words.length; i++) {
	            values.add(words[i]);
	        }
	        System.out.println("Expected Result:\t metropolitan");
	        System.out.print("Your Result:\t\t ");
	        System.out.println(findLongest(values));
	    }

}
