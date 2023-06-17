package demo;

import java.util.Scanner;

public class FindNumberofVowelsInString2 {

	public static void main(String[] args) {

		String sentence;
		Scanner sc = new Scanner(System.in);
		sentence = sc.nextLine();
		sc.close();
		System.out.println("Vowel count is " + countVowels(sentence));
	}

	private static int countVowels(String sentence) {
		System.out.println(sentence);
		String lcString = sentence.toLowerCase();
		System.out.println(lcString);
		int vowelCount = 0;
		for (int i = 0; i < lcString.length(); i++) {
			if (lcString.charAt(i) == 'a' || lcString.charAt(i) == 'e' || lcString.charAt(i) == 'i'
					|| lcString.charAt(i) == 'o' || lcString.charAt(i) == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

}
