package bigCodeFridays;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
	        // Get the word that will be used
	        String word = scanner.nextLine();
	        String result = "";

	        // Go through each character in the word
	        for (int i = 0; i < word.length(); ++i) {
	            char c = word.charAt(i);

	            // if the character is lower case (by ASCII), shift by 1 and convert back to character
	            // need to convert to int and back to char to get around compiler errors: http://sticksandstones.kstrom.com/appen.html
	            if (c >= 97 && c <= 122) {
	                // subtract 97 to bring the character range to 0 - 25 ( a being 0), add 1,
	                // use mod to make sure the result is contained in 0 - 25, add 97 back in to convert to char
	                int newChar = (((c - 97) + 1) % 26) + 97;
	                result += (char) newChar;
	            } else if (c >= 65 && c <= 90) {
	                // same as above, just with capital ascii characters
	                int newChar = (((c - 65) + 1) % 26) + 65;
	                result += (char) newChar;
	            } else {
	                // non alphabetic character
	                result += c;
	            }
	        }

	        System.out.println(result);
	        scanner.close();
	    }
	} 

	
