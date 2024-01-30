package com.practice;

public class Demo {

	public static void main(String[] args) {
		 int[] arr = new int[5];
		 
		 // 3,4,7,9 10
//		 Scanner sc = new Scanner(System.in);
		 
		 arr[0] = 5;
		 arr[1] = 3;
		 arr[2] = 4;
		 arr[3] = 2;
		 arr[4] = 1;
		 
		 int j;
		 for(int i = 0; i < arr.length-1; i++) {
			 int min = i;
			 for(j = i+1; j < arr.length; j++) {
				 if(arr[j] > arr[min]) {
					 min = j;
				 }
			 }
			 
			 if(min != i) { // when swapping not occur
				 int temp = arr[min];
				 arr[min] = arr[i];
				 arr[i] = temp; 
			 }
		 }
		 
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	}

}
