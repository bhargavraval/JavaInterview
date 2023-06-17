package demo;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateStringFromArray2 {

	public static void main(String[] args) {

		String[] strArray = { "Dog", "Cat", "Goat", "Horse", "Camel", "Elephant", "Cat", "Camel", "Goat", "Dog",
				"Camel", "Penguin", "Penguin" };

		List<String> dups = new ArrayList<>();

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j] && !dups.contains(strArray[i])) {
					dups.add(strArray[i]);
					System.out.println(strArray[j]);
				}
			}
		}

	}
}
