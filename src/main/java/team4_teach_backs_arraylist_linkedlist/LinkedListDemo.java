package team4_teach_backs_arraylist_linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> nums = new LinkedList<>();
        
        // Adding elements to the LinkedList
        nums.add(10); // Add at the end
        nums.add(20);
        nums.addFirst(5); // Add at the beginning
        nums.addLast(30); // Add at the end
        
        System.out.println("Initial LinkedList: " + nums); // Output: [5, 10, 20, 30]
        
        // Accessing elements in LinkedList
        int firstElement = nums.getFirst(); // Get the first element
        int lastElement = nums.getLast();   // Get the last element
        int secondElement = nums.get(1);    // Get element at index 1 (second element)
        
        System.out.println("First Element: " + firstElement);   // Output: 5
        System.out.println("Second Element: " + secondElement); // Output: 10
        System.out.println("Last Element: " + lastElement);     // Output: 30
        
        // Modifying elements
        nums.set(2, 25); // Set index 2 (was 20) to 25
        System.out.println("After set operation: " + nums); // Output: [5, 10, 25, 30]
        
        // Removing elements
        nums.removeFirst(); // Removes the first element (5)
        nums.removeLast();  // Removes the last element (30)
        nums.remove(1);     // Removes element at index 1 (was 25)
        
        System.out.println("After removal operations: " + nums); // Output: [10]
    }


}
