package string_built_in;

import java.util.Scanner;

public class SubString {

	public static String getSubString(String s, int index) {
		
		if(index < 0 || index > s.length()-1) {
			return "Invalid index";
		}
		
		String result = "";
		
		for(int i = index; i < s.length(); i++) {
			result += s.charAt(i);
		}
		
		return result;
	}
	
	public static String getSubString(String s, int startIndex, int endIndex) {
		
		if(startIndex < 0 || startIndex > s.length()-1 ||
			endIndex < 0 || endIndex > s.length() ||
			endIndex < startIndex) {
			return "Invalid index";
		}
		
		String result = "";
		
		for(int i = startIndex; i < endIndex; i++) {
			result += s.charAt(i);
		}
		
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println("Enter the starting index : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending index : ");
		int end = sc.nextInt();
		sc.close();

		System.out.println(s.substring(start, end)); // built-in
		System.out.println(getSubString(s, start, end)); // custom

	}
}
