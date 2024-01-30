package string_built_in;

import java.util.Scanner;

public class EndsWith {

	// Checks a String contained at the ending of another String
	public static boolean endsWith(String s1, String s2) {
		
		if(s2.length() > s1.length()) {
			return false;
		}
		
		// getting the starting index of s1
		int j = s1.length() - s2.length();
		
		for(int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) != s1.charAt(j)) {
				return false;
			}
			j++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();

		System.out.println(s1.endsWith(s2));
		System.out.println(endsWith(s1, s2));
	}
}
