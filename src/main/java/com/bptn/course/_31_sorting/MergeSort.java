package com.bptn.course._31_sorting;

import java.util.Arrays;

public class MergeSort {
	    public static void main(String[] args) {
	        int[] arr = {181, 289, 390, 121, 145, 736, 514, 212};
	        mergeSort(arr, 0, arr.length - 1);
	        
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }

	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int middle = (left + right) / 2;

	            // Sort first and second halves
	            mergeSort(arr, left, middle);
	            mergeSort(arr, middle + 1, right);

	            // Merge the sorted halves
	            merge(arr, left, middle, right);
	        }
	    }

	    public static void merge(int[] arr, int left, int middle, int right) {
	        // Find sizes of two sub-arrays to be merged
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        // Create temp arrays
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Copy data to temp arrays
	        System.arraycopy(arr, left, leftArray, 0, n1);
	        System.arraycopy(arr, middle + 1, rightArray, 0, n2);

	        // Merge the temp arrays

	        // Initial indexes of first and second sub-arrays
	        int i = 0, j = 0;

	        // Initial index of merged sub-array array
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArray[]
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArray[]
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
}
