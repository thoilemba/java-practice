package string_built_in;

import java.util.Scanner;

public class Replace {

	// Replaces all occurrence of old character with new character
	public static String replace(String s, char oldChar, char newChar) {
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == oldChar) {
				result += newChar;
			}else {
				result += ch;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println("Enter the old and the new character : ");
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		sc.close();
		System.out.println(s.replace(c1, c2));
		System.out.println(replace(s, c1, c2));
	}
}
