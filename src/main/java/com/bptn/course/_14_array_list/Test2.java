package com.bptn.course._14_array_list;

import java.util.List;
import java.util.ArrayList;

public class Test2 {
	    
	    public static String findLongest(ArrayList<String> list) {
	        //code here
	    	if (list == null || list.isEmpty()) {
	    		return null;
	    	}
	    	String longest = list.get(0);
	    	for (String str : list) {
	    		if (str.length() > longest.length()) {
	    			longest = str;
	    		}
	    	}
			return longest;
	        
	    }
	    
	    //Do not modify below code
	    public static void main(String[] args) {
	        //instantiate ArrayList 
	        ArrayList<String> values = new ArrayList<String>();
	        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
	        for (int i = 0; i < words.length; i ++) {
	            values.add(words[i]);
	        }
	        System.out.println("Expected Result: metropolitan");
	        System.out.print("Your Result: ");
	        System.out.println(findLongest(values));
	    }

}
