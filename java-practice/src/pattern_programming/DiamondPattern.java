package pattern_programming;

import java.util.Scanner;

public class DiamondPattern {

	public static void diamondPattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for(int i = 1; i <= n-1; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n*2-i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void diamondPattern2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				if(j == 1 || j == i*2-1 || i == n || j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i <= n-1; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n*2-i*2-1; j++) {
				if(j == 1 || j == n*2-i*2-1 || j == n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size (row/column) : ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("1.");
		diamondPattern1(n);
		System.out.println("2.");
		diamondPattern2(n);

	}
}
