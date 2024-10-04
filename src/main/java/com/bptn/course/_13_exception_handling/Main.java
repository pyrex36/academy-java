package com.bptn.course._13_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
//		try {
//			int result = 10/0;
//			System.out.println("Result: " + result);
//		}catch(ArithmeticException e) {
//			System.out.println("Cannot divide by zero");
//		}finally {
//			System.out.println("Program ended");
//		}
//		int[] numbers = {0, 2, 3, 4, 5};
//		int num1 = 5;
//		int num2 = 2;
		try {
			System.out.println("How many elements do you want in the array?");
			int count = scanner.nextInt();
			int[] numbers = new int[count];
			
			System.out.println("Enter two more numbers for division ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int result = num1/num2;
//			int result = 10/numbers[1];
			System.out.println("Element at index 10 is: " + numbers[10]);
			System.out.println("Result: " + result);
		}catch(InputMismatchException e) {
			System.out.println("Error: Please enter valid numbers");
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array only contains " );
		}finally {
			System.out.println("Program ended");
		}
	}

}
