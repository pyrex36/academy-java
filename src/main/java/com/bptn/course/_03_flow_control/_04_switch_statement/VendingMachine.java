package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Select an item:");
        System.out.println("1. Chips");
        System.out.println("2. Chocolate");
        System.out.println("3. Soda");
        System.out.println("4. Gum");
        System.out.println("5. Cookies");

        int choice = scanner.nextInt();
        String item;

        switch (choice) {
            case 1:
                item = "Chips";
                break;
            case 2:
                item = "Chocolate";
                break;
            case 3:
                item = "Soda";
                break;
            case 4:
                item = "Gum";
                break;
            case 5:
                item = "Cookies";
                break;
            default:
                item = "Invalid selection";
                break;
        }

        System.out.println("You selected: " + item);

	}

}
