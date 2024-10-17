package com.bptn.course._17_generics;

public class GenericsDemo1 {
	
	public static int findMax (int num1, int num2) {
		return (num1 > num2)?num1:num2;
	}
	public static<T> T findMaxGeneric(T num1, T num2) {
		return null;
	}

	public static void main(String[] args) {
		
		System.out.println("Max of 10 and 20: " + findMax(10, 20));

		  findMaxGeneric(10, 20);

		  findMaxGeneric(10.6, 20.8);

		  findMaxGeneric("Hi", "Hello");
	}

}
