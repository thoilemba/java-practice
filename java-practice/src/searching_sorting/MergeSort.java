package searching_sorting;

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int[] array) {
		
		int length = array.length;
		
		if(length <= 1) {
			return;  // base case, end of recursive call
		}
		
		// creating two sub-array from the original array
		int middle = length/2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length-middle];
		
		int i = 0, j = 0; // counter for left and right array
		
		// splitting the array into two halves
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}else {
				rightArray[j] = array[i];
				j++;
			}
		}
		
		// recursive call to further divide the sub-arrays into smallest unit
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(array, leftArray, rightArray); // merging the sub-arrays
	}
	
	public static void merge(int[] array, int[] leftArray, int[] rightArray) {
		
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		// counter for resultant array, left and right array
		int i = 0, l = 0, r = 0;
		
		// assigning values from left and right arrays to the original array
	    // by comparing each elements
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		
		// assigning remaining elements of right leftArray
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		
		// assigning remaining elements of right rightArray
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
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
		
		mergeSort(myArray);
		
		System.out.println("The sorted elements :");
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] + " ");
		}	
	}
}
