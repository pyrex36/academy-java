package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		
		int [] [] grades = {
				
				{85, 90, 75},
				{34, 65, 45},
				{54, 90, 95},
		};
		
		System.out.println(grades[2] [1]);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				grades[i] [j] +=2;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) 
				System.out.println(grades [i] [j]);
				System.out.println(grades);
			}

	}
}
