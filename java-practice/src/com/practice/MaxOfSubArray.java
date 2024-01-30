package com.practice;

import java.util.ArrayDeque;

public class MaxOfSubArray {
	
	public static void maxOfSubArray(int[] arr, int k) {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		
		// Processing the first sub-array of size k
		for(int i = 0; i < k; i++) {
			while(!arrayDeque.isEmpty() && arr[i] >= arr[arrayDeque.peekLast()]) {
				arrayDeque.pollLast();
			}
			arrayDeque.offerLast(i);
		}
		
		// Working with the remaining elements
		for(int i = k; i < arr.length; i++) {
			System.out.println(arr[arrayDeque.peekFirst()]);
			
			// removing the elements which are not the part of the current sub-array
			while(!arrayDeque.isEmpty() && arrayDeque.peekFirst() <= i-k) {
				arrayDeque.pollFirst();
			}
			
			// removing the elements which is smaller than the current element
			while(!arrayDeque.isEmpty() && arr[i] >= arr[arrayDeque.peekLast()]) {
				arrayDeque.pollLast();
			}
			
			arrayDeque.offerLast(i); // adding the current index to the dequeue
		}
		
		// Print the maximum element of the last sub-array
		System.out.println(arr[arrayDeque.peekFirst()]);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 10, 9, 15, 20, 10, 8};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr3 = {7, 6, 5, 4, 3, 2, 1};
		int k = 3;
		
		System.out.println("Using Dequeue :");
		maxOfSubArray(arr, k);
		System.out.println();
		maxOfSubArray(arr2, k);
		System.out.println();
		maxOfSubArray(arr3, k);

	}



}
