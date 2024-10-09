package com.bptn.course._20_hash_set;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSet<String> mySet = new HashSet<>();
		
		mySet.add("Toronto");
		mySet.add("Vancouver");
		mySet.add("Scarborough");
		System.out.println(mySet);
		
		System.out.println(mySet.contains("toronto"));
		
		mySet.remove("Vancouver");
		System.out.println(mySet);
		
		
	}

}
