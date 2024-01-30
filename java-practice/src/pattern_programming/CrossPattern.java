package pattern_programming;

import java.util.Scanner;

public class CrossPattern {
	
	public static void crossPattern1(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j || j == n-i+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void crossPattern2(int n) {
		
		int numb1 = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j || j == n-i+1) {
					if(numb1 <= 9) {
						System.out.print("0"+numb1++ +" ");
					}else {
						System.out.print(numb1++ +" ");
					}
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	public static void crossPattern3(int n) {
		int numb1 = 1;
		int numb2 = n;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) {
					if(numb1 <= 9) {
						System.out.print("0"+numb1++ +" ");
					}else {
						System.out.print(numb1++ +" ");
					}
				}else if(j == n-i+1){
					if(numb2 <= 9) {
						System.out.print("0"+numb2++ +" ");
					}else {
						System.out.print(numb2++ +" ");
					}
				}else {
					System.out.print("   ");
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
		crossPattern1(n);
		System.out.println("2.");
		crossPattern2(n);
		System.out.println("3.");
		crossPattern3(n);
	}
}
