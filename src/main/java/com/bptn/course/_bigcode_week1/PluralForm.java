package com.bptn.course._bigcode_week1;

import java.util.Scanner;

public class PluralForm {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int amt;
	        String word;

	        // Ask for input
	        System.out.print("# in: ");
	        amt = scanner.nextInt();
	        // Need to scan another line for some reason, it detects the number input as a line. Just throw this away.
	        scanner.nextLine();
	        System.out.print("word: ");
	        word = scanner.nextLine();

	        // Easy case if it's not plural
	        if (amt == 1) {
	            System.out.println(String.format("1 %s", word));
	        } else {

	            // Need this boolean to check to see if there was a match before the single case
	            boolean found = true;
	            // Need to check the length to see if the string is big enough
	            if (word.length() >= 2) {
	                String start = word.substring(0, word.length() - 2);
	                String ending = word.substring(word.length() - 2, word.length());
	                // Follow the lookup rules
	                switch (ending) {
	                    case "fe":
	                        System.out.println(String.valueOf(amt) + " " + start + "ves");
	                        break;
	                    case "sh":
	                    case "ch":
	                        System.out.println(String.valueOf(amt) + " " + word + "es");
	                        break;
	                    case "us":
	                        System.out.println(String.valueOf(amt) + " " + start + "i");
	                        break;
	                    case "ay":
	                    case "oy":
	                    case "ey":
	                    case "uy":
	                        System.out.println(String.valueOf(amt) + " " + word + "s");
	                        break;
	                    default:
	                      // didn't find one for this option, check the other options
	                      found = false;
	                      break;
	                }
	            } 
	            
	            // Check to see the single word ends,
	            if (word.length() >= 1 && !found) {
	                String start = word.substring(0, word.length() - 1);
	                String ending = word.substring(word.length() - 1, word.length());
	                switch (ending) {
	                    case "y":
	                        System.out.println(String.valueOf(amt) + " " + start + "ies");
	                        break;
	                    default:
	                        System.out.println(String.valueOf(amt) + " " + word + "s");
	                        break;
	                }
	            }
	        }

	        // close the scanner
	        scanner.close();
	    }
}
