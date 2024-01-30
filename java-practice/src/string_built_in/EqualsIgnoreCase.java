package string_built_in;

import java.util.Scanner;

public class EqualsIgnoreCase {
	
	public static boolean myEqualsIgnoreCase(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
//			a = 97, z = 122			
//			A = 65, Z = 90
			
			// when c1 is Upper case and c2 is Lower case
			if((c1 >= 65 && c1 <= 90) && (c2 >= 97 && c2 <= 122)) {
				if(c1+32 != c2) {
					return false;
				}
			//	when c1 is Lower case and c2 is Upper case
			}else if ((c1 >= 97 && c1 <= 122) && (c2 >= 65 && c2 <= 90)){
				if(c1-32 != c2) {
					return false;
				}
			// other characters
			}else if(c1 != c2) {
				return false;
			}
		}

		return true;
	}

	public static boolean equalIgnoreCase2(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			// not(when both the characters are same or one is lower and other is upper
			// or one is upper and other is lower)
			if (c1 - c2 != 0 // e.g. a - a or A - A = 0
				&& c1 - c2 != 32 // e.g. a - A = 32
				&& c1 - c2 != -32) { // e.g. A - a = -32
				return false;
			}
		}
		return true;

	}
	
	public static boolean equalIgnoreCase3(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			// when both the characters are same or one is lower and other is upper
			// or one is upper and other is lower
			if (c1 - c2 == 0 || c1 - c2 == 32 || c1 - c2 == -32) {
				count++;
			}
		}
		if (count == s1.length())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		System.out.println(myEqualsIgnoreCase(s1, s2));
		System.out.println(equalIgnoreCase2(s1, s2));
		System.out.println(equalIgnoreCase3(s1, s2));
	}

}
