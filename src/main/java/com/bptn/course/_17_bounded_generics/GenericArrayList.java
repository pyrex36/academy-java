package com.bptn.course._17_bounded_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	 public static void main(String[] args) {
	        List<Integer> intNumbers = new ArrayList<>();
	        intNumbers.add(1);
	        intNumbers.add(2);
	        intNumbers.add(3);

	        List<Double> doubleNumbers = new ArrayList<>();
	        doubleNumbers.add(1.1);
	        doubleNumbers.add(2.2);
	        doubleNumbers.add(3.3);

	        double intSum = sum(intNumbers);
	        double doubleSum = sum(doubleNumbers);

	        System.out.println("Sum of integers: " + intSum);
	        System.out.println("Sum of doubles: " + doubleSum);
	    }

	    public static <T extends Number> double sum(List<T> numbers) {
	        double total = 0;
	        for (T number : numbers) {
	            total += number.doubleValue();
	        }
	        return total;
	    }
}
