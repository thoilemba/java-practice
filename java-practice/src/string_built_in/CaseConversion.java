package string_built_in;

import java.util.Scanner;

public class CaseConversion {

	public static String toUpperCase(String s) {
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 97 && c <= 122) { // a = 97, z = 122
				result = result + (char)(c-32);
			}else {
				result = result + c;
			}
		}
		
		return result;
	}
	
	public static String toLowerCase(String s) {
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 65 && c <= 90) { // A = 65, Z = 90
				result = result + (char)(c+32);
			}else {
				result = result + c;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		sc.close();

		System.out.println(toUpperCase(s));
		System.out.println(toLowerCase(s));
	}

}
