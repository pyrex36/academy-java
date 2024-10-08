package com.bptn.course._14_array_list;

import java.util.*;

public class ToDoList {
	    
	   public static void main(String[] args) {
	      // Using an ArrayList instead of an array
	      ArrayList<String> toDoList = new ArrayList<>();
	      toDoList.add("Do homework");
	      toDoList.add("Help make dinner");
	      toDoList.add("Call grandma");

	      // changing element at index 1
	      toDoList.set(1, "Order pizza");

	      System.out.println(toDoList.size() + " things to do!");
	      System.out.println("Here's the first thing to do: " + toDoList.get(0));

	      // remove item 0
	      toDoList.remove(0);

	      System.out.println("Here's the next thing to do: " + toDoList.get(0));
	   }


}
