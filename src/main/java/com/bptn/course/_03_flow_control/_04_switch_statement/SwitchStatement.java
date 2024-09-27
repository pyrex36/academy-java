package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int day = scanner.nextInt();
		
		switch(day) {
		case 1: System.out.println("Today is Sunday");
				break;
		case 2: System.out.println("Today is Sunday");
				break;
		case 3: System.out.println("Today is Sunday");
				break;
		case 4: System.out.println("Today is Sunday");
		case 5: System.out.println("Today is Sunday");
		case 6: System.out.println("Today is Sunday");
		case 7: System.out.println("Today is Sunday");
		default: System.out.println("Invalid Number");
		}

	}
}
