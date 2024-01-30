package pattern_programming;

import java.util.Scanner;

public class PyramidPattern {

	public static void pyramid1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}

	public static void pyramid2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyramid3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n - 1; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= n - i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pyramid4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 2; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// co-relating i, j and n
	public static void pyramid5(int n) {

		for (int i = 1; i <= n; i++) {
			char c = 'A';

			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n*2-i*2+1; j++) {
				if (j < n - i + 1) {
					System.out.print(c++);
				} else {

					System.out.print(c--);
				}
			}
			System.out.println();
		}
	}

	// co-relating i, j and n
	public static void pyramidTest(int n) {
		
		int row = n*2-1;

		for (int i = 1; i <= row; i++) {
			int c = 1;
			if(i <= n) {
				for(int k = 1; k <= n-i; k++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(c++ +" ");
				}
			}else {
				for(int k = 1; k <= i-n; k++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= row-i+1; j++) {
					System.out.print(c++ +" ");
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
		pyramid1(n);
		System.out.println("2.");
		pyramid2(n);
		System.out.println("3.");
		pyramid3(n);
		System.out.println("4.");
		pyramid4(n);
		System.out.println("5.");
		pyramid5(n);
		System.out.println("6.");
		pyramidTest(n);
	}
}
