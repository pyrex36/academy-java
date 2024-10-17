package com.bptn.course._17_bounded_generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedGenericArrayList {
	
	 public static void main(String[] args) {
	        List<Integer> intNumbers = new ArrayList<>();
	        intNumbers.add(1);
	        intNumbers.add(2);
	        intNumbers.add(3);

	        List<Double> doubleNumbers = new ArrayList<>();
	        doubleNumbers.add(1.1);
	        doubleNumbers.add(2.2);
	        doubleNumbers.add(3.3);

	        List<Float> floatNumbers = new ArrayList<>();
	        floatNumbers.add(1.1f);
	        floatNumbers.add(2.2f);
	        floatNumbers.add(3.3f);

	        double intSum = sum(intNumbers);
	        double doubleSum = sum(doubleNumbers);
	        double floatSum = sum(floatNumbers);

	        System.out.println("Sum of integers: " + intSum);
	        System.out.println("Sum of doubles: " + doubleSum);
	        System.out.println("Sum of floats: " + floatSum);
	    }

	    public static <T extends Number> double sum(List<T> numbers) {
	        double total = 0;
	        for (T number : numbers) {
	            total += number.doubleValue();
	        }
	        return total;
	    }
}
