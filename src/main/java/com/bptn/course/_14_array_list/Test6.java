package com.bptn.course._14_array_list;

import java.util.List;
	import java.util.ArrayList;

public class Test6 {

	
	    public static void removeLongStrings(ArrayList<String> list) {
	        list.removeIf(str -> str.length() > 4);
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Strings
	        ArrayList<String> values = new ArrayList<String>();
	        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
	        for (String word : words) {
	            values.add(word);
	        }
	        removeLongStrings(values);
	        System.out.println("Expected Result:\t [fish, cat, foo]");
	        System.out.println("Your Result:\t\t " + values);
	    }
	

}
