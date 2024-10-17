package com.bptn.course._31_sorting;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubbleSort(int array[]) {
		int size = array.length;		
		// loop for every array element
		for (int i = 0; i < size -1; i++) {
			
			for (int j = 0; j < size -1; j++) {
				// comparison
				// if value on left is greater than value on the right
				//we swap
				if (array [j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		// loop for comparison
	}

	public static void main(String[] args) {
		
		int[] data = {5, 3, -1, 7, 10, 2};
		System.out.println("Before Sort: " + Arrays.toString(data));
		BubbleSort.bubbleSort(data);
		System.out.println();
		System.out.println("After sort: " + Arrays.toString(data));

	}

}
