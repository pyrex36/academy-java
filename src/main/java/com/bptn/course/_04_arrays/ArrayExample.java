package com.bptn.course._04_arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		int [] numbers = new int[3];
		int [] [] numbers = new int[3][];
		
		int [] [] grades = {
				{85, 90},
				{88, 92},
				{70, 65}
		};
		
		int maxValue = 0;
		for (int i=0; i < 3; i++) {
			for (int j=0; j <3; j++) {
				if(grades[i][j] > maxValue) {
					maxValue = grades[i][j];
				}
			}
		}

	}

}
