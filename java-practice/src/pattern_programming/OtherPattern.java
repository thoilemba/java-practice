package pattern_programming;

import java.util.Scanner;

public class OtherPattern {

	public static void pattern1(int n) {

		int numb = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					if (numb <= 9) {
						System.out.print("0" + numb++ + " ");
					} else {
						System.out.print(numb++ + " ");
					}
				}
			} else {
				int rev = numb + i - 1;
				for (int j = 1; j <= i; j++) {
					if (rev <= 9) {
						System.out.print("0" + rev-- + " ");
					} else {
						System.out.print(rev-- + " ");
					}
					numb++;
				}
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {

		int numb = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= n; j++) {
					if (numb <= 9) {
						System.out.print("0" + numb++ + " ");
					} else {
						System.out.print(numb++ + " ");
					}
				}
			} else {
				int rev = n * i;
				for (int j = 1; j <= n; j++) {
					if (rev <= 9) {
						System.out.print("0" + rev-- + " ");
					} else {
						System.out.print(rev-- + " ");
					}
					numb++;
				}
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {

		for (int i = 1; i <= n; i++) {

			int numb = i * (i + 1) / 2;// sum of i natural number
			for (int j = 1; j <= i; j++) {
				if (numb <= 9) {
					System.out.print("0" + numb-- + " ");
				} else {
					System.out.print(numb-- + " ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {

		for (int i = 1; i <= n; i++) {

			int numb = i * (i + 1) / 2;// sum of i natural number
			for (int j = 1; j <= i; j++) {
				if (j != i) {
					if (numb <= 9) {
						System.out.print("0"+ numb-- + "* ");
					} else {
						System.out.print(numb-- +"* ");
					}
				} else {
					if (numb <= 9) {
						System.out.print("0"+ numb-- + " ");
					} else {
						System.out.print(numb-- +" ");
					}
				}
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
		pattern1(n);
		System.out.println("2.");
		pattern2(n);
		System.out.println("3.");
		pattern3(n);
		System.out.println("4.");
		pattern4(n);
	}
}
