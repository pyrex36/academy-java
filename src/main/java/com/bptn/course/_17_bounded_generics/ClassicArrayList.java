package com.bptn.course._17_bounded_generics;

import java.util.ArrayList;
import java.util.List;

public class ClassicArrayList {
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        int sum = sum(numbers);
	        System.out.println("Sum of integers: " + sum);
	    }

	    public static int sum(List<Integer> numbers) {
	        int total = 0;
	        for (Integer number : numbers) {
	            total += number;
	        }
	        return total;
	    }
}
