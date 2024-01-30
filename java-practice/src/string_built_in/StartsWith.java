package string_built_in;

import java.util.Scanner;

public class StartsWith {

	// Checks a String contained at the beginning of another String 
	public static boolean startsWith(String s1, String s2) {
		
		if(s2.length() > s1.length()) {
			return false;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) != s1.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();

		System.out.println(s1.startsWith(s2));
		System.out.println(startsWith(s1, s2));
	}
}
