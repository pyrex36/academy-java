package com.bptn.course._05_strings;

import java.util.Scanner; 

public class Strings {

	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting);
		
/*		String userName= "testuser";
		System.out.println(userName.length());
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(4));
		System.out.println(userName.substring(2,4));
		System.out.println(userName.equals("testuser"));
		System.out.println(userName.trim());
		System.out.println(userName.indexOf('s'));
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();
		
		int vowelCount = 0;
		int consonantCount = 0;

		String lowerCaseInput = input.toLowerCase();
		
		for(int i=0; i < lowerCaseInput.length(); i++); {
			char ch = lowerCaseInput.charAt(i);
			
			if(ch=='a' || ch=='b');
		}





		

	}
}
