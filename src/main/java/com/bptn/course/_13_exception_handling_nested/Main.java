package com.bptn.course._13_exception_handling_nested;

public class Main {
	    void method() {
	        try {
	            // Outer try block
	            try {
	                // Inner try block
	                int[] arr = {1, 2, 3, 4};
	
	                // This will throw ArrayIndexOutOfBoundsException
	                System.out.println("Element at index 5: " + arr[5]);
	            } catch (ArithmeticException e) {
	                System.out.println("ArithmeticException occurred");
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
	        }
	    }

	    // main() method to run the program
	    public static void main(String args[]) {
	        Main nestedTryBlockSolutionObject = new Main();
	        nestedTryBlockSolutionObject.method();
	    }
	
}
