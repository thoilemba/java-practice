package searching_sorting;

import java.util.Scanner;

public class Sorting {

	static void selectionSort(int arr[]) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			if(i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	static void bubbleSort(int arr[]) {
		
		boolean swapped = false;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false) {
				break;
			}
		}
	}
	
	static void insertionSort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i]; // current starts from 2nd element
			int j = i - 1; // j starts from 1st element which is already sorted
			
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array :");
		int[] myArray = new int[size];
		
		for(int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		sc.close();
		
//		selectionSort(myArray);
//		bubbleSort(myArray);
		insertionSort(myArray);
		System.out.println("The sorted elements :");
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] +" ");
		}
	}
}
