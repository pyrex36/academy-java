package com.bptn.course._30_search_algorithms_time_com;

import java.io.IOException;
import java.util.Scanner;

		class Main 
		{
		  public static void main(String[] args) throws IOException 
		  {
		    SpellChecker checker = new SpellChecker();

		    System.out.print("Enter a word to spell check or q to quit: ");
		    Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    while (!word.equals("q")) {
		      if (checker.linearSpellCheck(word))
		        System.out.println(word + " is spelled correctly!");
		      else
		        System.out.println(word + " is misspelled!");
		      checker.binarySpellCheck(word);
		      System.out.print("Enter a word to spell check or q to quit: ");
		      word = scan.nextLine();
		      }    
		      scan.close();
		  }
}
