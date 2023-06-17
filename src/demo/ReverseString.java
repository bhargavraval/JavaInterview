package demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String originalStr = sc.nextLine();

		// String originalStr = "Java is an object oriented language";
		System.out.println(reverseString(originalStr));
	}

	private static String reverseString(String originalStr) {
		String reverseString = "";
		for (int i = originalStr.length() - 1; i >= 0; i--) {
			reverseString = reverseString + originalStr.charAt(i);
		}
		return reverseString;
	}

}
