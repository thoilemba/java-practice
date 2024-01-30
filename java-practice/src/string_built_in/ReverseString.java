package string_built_in;

import java.util.Scanner;

public class ReverseString {
	
	// Reverse Traversal Method
	public static String reverseString1(String s) {
		
		String result = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			result = result + s.charAt(i);
		}

		return result;
	}
	
	// Swapping Elements Method
	public static String reverseString2(String s) {
		
		char[] charArray = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		
		return new String(charArray);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		sc.close();
		
		System.out.println(reverseString1(s));
		System.out.println(reverseString2(s));
		
	}
}
