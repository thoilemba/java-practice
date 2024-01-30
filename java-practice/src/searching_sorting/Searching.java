package searching_sorting;

import java.util.Scanner;

public class Searching {
	
	
	static int linearSearch(int arr[], int key) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	static int binarySearch(int arr[], int key) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(key < arr[mid]) {
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
	
		int[] myArray = new int[size];
		
		System.out.println("Enter the elements of the array :");
		for(int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the element to be searched :");
		int number = sc.nextInt();
		sc.close();
		
		int result = binarySearch(myArray, number);
		if(result == -1) {
			System.out.println("The element is not present in the list.");
		}else {
			System.out.println("The element is found at index "+result);
		}
		
	}
}
