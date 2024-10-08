package com.bptn.course._14_array_list;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	public static void main(String[] args) {
		
		int counter = 1;
		
		ArrayList<String> myBooks = new ArrayList<>();
		myBooks.add("Book1");
		myBooks.add("Book2");
		myBooks.add("Book3");
		
		System.out.println(myBooks);
		for (String book: myBooks) {
			System.out.println("Book: " + counter +":" + book);
			counter++;
		}
		System.out.println(myBooks.getFirst());
		System.out.println(myBooks.get(0));
		myBooks.remove(1);
		
		// Search for book
		if (myBooks.contains("Book3")) {
			System.out.println("Book found");
		}else {
			System.out.println("Book not found");
		}
		System.out.println("The size of the list is " + myBooks.size());
		System.out.println("The size of the list is " + myBooks.get(myBooks.size() -1));

		
	}
	
}
