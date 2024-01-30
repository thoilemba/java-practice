package string_built_in;

import java.util.Scanner;

public class Trim {
	
	// Removes spaces that present at the beginning and ending of a String
	public static String myTrim(String s) {
		
		String result = "";
		
		int startIndex = 0;
		int endIndex = s.length()-1;
		
		// getting the index of the first character(non-space)
		while(startIndex < s.length() && s.charAt(startIndex) == ' ') {
			startIndex++;
		}
		
		// getting the index of the last character(non-space)
		while(endIndex >= 0 && s.charAt(endIndex) == ' ') {
			endIndex--;
		}
		
		for(int i = startIndex; i <= endIndex; i++) {
			result += s.charAt(i);
		}
		
		return result;
	}
	
	// Removes all the spaces present in a String
	public static String myTrimAll(String s) {
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' ') { // ' ' = 32 in ASCII
				result += s.charAt(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		sc.close();
		System.out.println(s.trim()); // built-in
		System.out.println(myTrim(s)); // custom
		System.out.println(myTrimAll(s));
	}

}
