package pattern_programming;

import java.util.Scanner;

public class TrianglePattern {

	public static void triangle1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void triangle2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void triangle3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void triangle4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		triangle1(n);
		System.out.println();
		triangle2(n);
		System.out.println();
		triangle3(n);
		System.out.println();
		triangle4(n);
	}

}
