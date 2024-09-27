package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Select an item:");
        System.out.println("1. Chips - $1.00");
        System.out.println("2. Chocolate - $1.50");
        System.out.println("3. Soda - $1.25");
        System.out.println("4. Gum - $0.75");
        System.out.println("5. Cookies - $1.25");

        int choice = scanner.nextInt();
        String item;
        double price;

        switch (choice) {
            case 1:
                item = "Chips";
                price = 1.00;
                break;
            case 2:
                item = "Chocolate";
                price = 1.50;
                break;
            case 3:
                item = "Soda";
                price = 1.25;
                break;
            case 4:
                item = "Gum";
                price = 0.75;
                break;
            case 5:
                item = "Cookies";
                price = 1.25;
                break;
            default:
                item = "Invalid selection";
                price = 0.00;
                break;
        }
        
        if (price > 0) {
            System.out.println("You selected: " + item + " - $" + price);
        } else {
            System.out.println(item);
        }

	}

}
