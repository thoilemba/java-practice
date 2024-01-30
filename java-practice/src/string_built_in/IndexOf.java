package string_built_in;

import java.util.Scanner;

public class IndexOf {

	public static int indexOf(String s, char key) {
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int indexOfLast(String s, char key) {
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println("Enter the character :");
		char c = sc.next().charAt(0);
		sc.close();
		System.out.println(indexOf(s, c));
		System.out.println(indexOfLast(s, c));
	}
}
