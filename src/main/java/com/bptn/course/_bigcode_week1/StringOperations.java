package com.bptn.course._bigcode_week1;
import java.util.Scanner;

public class StringOperations {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int option; // Variable to store user’s menu choice

	        // Start a do-while loop to keep showing the menu until user exits
	        do {
	            // Displaying the menu options
	            printMenu();
	            
	            option = scanner.nextInt();
	            scanner.nextLine(); // Consumes the extra newline character after int input

	            // Switch case to handle user input for various string operations
	            switch (option) {
	                case 1:
	                    // Option for Palindrome Check
	                    System.out.println("Palindrome Check");
	                    System.out.print("Enter a string: ");
	                    String palindromeStr = scanner.nextLine();
	                    if (isPalindrome(palindromeStr)) {
	                        System.out.println(palindromeStr + " is a palindrome.");
	                    } else {
	                        System.out.println(palindromeStr + " is not a palindrome.");
	                    }
	                    break;
	                case 2:
	                    // Option for Reverse String
	                    System.out.print("Enter a string to reverse: ");
	                    String reverseStr = scanner.nextLine();
	                    System.out.println("Reversed string: " + reverseString(reverseStr));
	                    break;
	                case 3:
	                    // Option for Concatenating two Strings
	                    System.out.print("Enter First string: ");
	                    String firstStr = scanner.nextLine();
	                    System.out.print("Enter Second string: ");
	                    String secondStr = scanner.nextLine();
	                    System.out.println(firstStr + secondStr); // Concatenate and print strings
	                    break;
	                case 4:
	                    // Option for String Comparison
	                    System.out.println("String Comparison");
	                    System.out.print("Enter First string: ");
	                    String str1 = scanner.nextLine();
	                    System.out.print("Enter Second string: ");
	                    String str2 = scanner.nextLine();
	                    if (str1.equals(str2)) {
	                        System.out.println("The entered strings are equal.");
	                    } else {
	                        System.out.println("The entered strings are not equal.");
	                    }
	                    break;
	                case 5:
	                    // Option for Calculating Length of a String
	                    System.out.println("Length of a string");
	                    System.out.print("Enter a string: ");
	                    String lengthStr = scanner.nextLine();
	                    System.out.println("The length of the entered string is: " + lengthStr.length());
	                    break;
	                default:
	                    // Handle invalid option
	                    System.out.println("Invalid choice! Please make a valid choice.");
	            }

	            System.out.println(); // Blank line for better readability
	        } while (true); // Repeat loop until the user chooses to exit
	    }

	    // Method to check if a string is a palindrome
	    private static boolean isPalindrome(String str) {
	        String reversedStr = new StringBuilder(str).reverse().toString(); // Reverse the string
	        return str.equals(reversedStr); // Compare original and reversed string
	    }

	    // Method to reverse a given string
	    private static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString(); // Reverses and returns the string
	    }

	    // put into it's own function, cleans up the main method
	    private static void printMenu(){
	        System.out.println("/…String Menu…/");
	        System.out.println("Press 1 for Palindrome Check");
	        System.out.println("Press 2 to reverse a String");
	        System.out.println("Press 3 to Concatenate two Strings");
	        System.out.println("Press 4 for String Comparison");
	        System.out.println("Press 5 to Calculate the Length of String");
	        System.out.print("Enter the option: ");
	    }
	


}
