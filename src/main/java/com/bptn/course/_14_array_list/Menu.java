package com.bptn.course._14_array_list;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
	    public static void main(String[] args) {
	        ArrayList<String> menuList = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add item");
	            System.out.println("2. Remove item");
	            System.out.println("3. Fetch item");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item to add: ");
	                    String addItem = scanner.nextLine();
	                    menuList.add(addItem);
	                    System.out.println("Item added.");
	                    break;
	                case 2:
	                    System.out.print("Enter item to remove: ");
	                    String removeItem = scanner.nextLine();
	                    if (menuList.remove(removeItem)) {
	                        System.out.println("Item removed.");
	                    } else {
	                        System.out.println("Item not found.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter index to fetch: ");
	                    int index = scanner.nextInt();
	                    if (index >= 0 && index < menuList.size()) {
	                        System.out.println("Item at index " + index + ": " + menuList.get(index));
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }

}
