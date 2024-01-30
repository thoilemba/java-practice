package com.practice;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array :");
		for(int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		sc.close();
		
		
		System.out.println("The sorted elements :");
		for(int i = 0; i < size; i++) {
			System.out.print(myArray[i] +" ");
		}
	}


}
