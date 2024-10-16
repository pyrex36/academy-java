package com.bptn.course._29_search_binary;
	
	import java.util.Arrays;

	public class Main {
	    public void Start() {
	        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
	        int key = 1;
	        Arrays.sort(array);  // Sort array
	        int result = binarySearch(array, key);
	        // Print values in array after sort
	        System.out.println("Sorted array: " + Arrays.toString(array));
	        System.out.println("Index of key: " + result);
	    }

	    int binarySearch(int arr[], int key) {
	        int low = 0;
	        int high = arr.length - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        return -1;  // Key not found
	    }

	    public static void main(String[] args) {
	        Main main = new Main();
	        main.Start();
	    }
}
	
	// let min = 0, max = n-1, n=10
		// mid = (0 + 9)/2 = 4
		// arr[mid] = 
		//update 
