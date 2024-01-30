package string_built_in;

import java.util.Scanner;

public class Contains {

	public static boolean contains(String s1, String s2) {
		
		int k = s2.length();
		
		if(k > s1.length()) {
			return false;
		}
		
		// getting the substrings of s1 having size of s2.length()
		for(int i = 0; i <= s1.length()-k; i++) {
			String str = "";
			for(int j = i; j < k+i; j++) {
				str += s1.charAt(j);
			}
			if(str.equals(s2)) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Substring : ");
		String s2 = sc.nextLine();
		sc.close();

		System.out.println(s1.contains(s2));
		System.out.println(contains(s1, s2));

	}
}
