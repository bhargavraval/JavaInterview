package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNumberofVowelsInString {

	public static void main(String[] args) {

		String sentence;
		Scanner sc = new Scanner(System.in);
		sentence = sc.nextLine();
		sc.close();
		System.out.println("Vowel count is " + countVowels(sentence));
	}

	private static int countVowels(String sentence) {
		String vowel = "aeiou";
		List<Character> vowelChars = new ArrayList<>();
		for (int i = 0; i < vowel.length(); i++) {
			vowelChars.add(vowel.charAt(i));
		}

		System.out.println(sentence);
		String lcString = sentence.toLowerCase();
		System.out.println(lcString);
		int vowelCount = 0;
		for (int i = 0; i < lcString.length(); i++) {
			if (vowelChars.contains(lcString.charAt(i))) {
				vowelCount++;
			}
		}
		return vowelCount;
	}

}
