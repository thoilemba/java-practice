package pattern_programming;

import java.util.Scanner;

public class BoxPattern {

	public static void boxPattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void boxPattern2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void boxPattern3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j || j == n - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void boxPattern4(int n) {

		int numb = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					if (numb <= 9) {
						System.out.print("0" + numb++ + " ");
					} else {
						System.out.print(numb++ + " ");
					}
				}else {
					System.out.print("   ");
				}

			}

			System.out.println();
		}
	}

	public static void boxPattern5(int n) {

		for (int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i+1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("1.");
		boxPattern1(n);
		System.out.println("2.");
		boxPattern2(n);
		System.out.println("3.");
		boxPattern3(n);
		System.out.println("4.");
		boxPattern4(n);
		System.out.println("5.");
		boxPattern5(n);
	}
}
