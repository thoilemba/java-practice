package string_built_in;

import java.util.Scanner;

public class ToCharArray {

	public static char[] toCharArray(String s) {
		
		char[] result = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			result[i] = s.charAt(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		sc.close();
		
//		char[]	arr = s.toCharArray(); // built-in
		char[]	arr = toCharArray(s); // custom

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
