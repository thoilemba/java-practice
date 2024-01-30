package string_built_in;

import java.util.Scanner;

public class Equals {

	public static boolean myEquals(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		System.out.println(s1.charAt(0) == s2.charAt(0));

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
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

		System.out.println(myEquals(s1, s2));

	}

}
