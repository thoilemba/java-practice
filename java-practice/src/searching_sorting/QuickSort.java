package searching_sorting;

import java.util.Scanner;

public class QuickSort {

	// helper method only for taking the array as input
	public static void quickSort(int[] array) {
		
		quickSort(array, 0, array.length-1);
	}
	
	private static void quickSort(int[] array, int start, int end) {
		
		if(start >= end) {
			return;  // base case; remains only one element
		}
		
		// getting index of the pivot
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1); // left partition
		quickSort(array, pivot+1, end); // right partition
	}
	
	/* This function takes last element as pivot,
	 places the pivot element at its correct position in sorted array,
	 and places all smaller (than pivot) to left of pivot 
	 and all greater elements to right of pivot */
	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int j = start-1;  // index of smaller element
		
		for(int i = start; i < end; i++) {
			if(arr[i] < pivot) { // no need to add equal(=) here
				j++;			 // as it will swapped the same element
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		j++;
		int temp = arr[j];
		arr[j] = pivot; // pivot is moved to the right place
		arr[end] = temp;
		
		
		return j; // index of the pivot
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		int size = scanner.nextInt();
		int myArray[] = new int[size];
		
		System.out.println("Enter the elements of the array :");
		for(int i = 0; i < size; i++) {
			myArray[i] = scanner.nextInt();
		}
		scanner.close();
		
		quickSort(myArray);
		
		System.out.println("The sorted elements :");
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] + " ");
		}
		
	}
}
