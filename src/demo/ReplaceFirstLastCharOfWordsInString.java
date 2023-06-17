package demo;

public class ReplaceFirstLastCharOfWordsInString {

	public static void main(String[] args) {

		String str = "Java is an Object Oriented Programming Language";
		System.out.println(count(str));

	}

	static String count(String str) {
		// Create an equivalent char array of given string
		char[] ch = str.toCharArray();
		System.out.println("String before: " + String.valueOf(ch));
		for (int i = 0; i < ch.length; i++) {

			// k stores index of first character and i is going to store index of last
			// character.
			int k = i;
			System.out.println("Value of k: " + k);
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			System.out.println("value of i: " + i);
			// Swapping
			char temp = ch[k];
			ch[k] = ch[i - 1];
			ch[i - 1] = temp;

			// We assume that there is only one space between two words.
		}
		return new String(ch);
	}

}
