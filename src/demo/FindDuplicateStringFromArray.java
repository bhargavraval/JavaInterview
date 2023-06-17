package demo;

public class FindDuplicateStringFromArray {

	public static void main(String[] args) {

		String[] strArray = { "Dog", "Cat", "Goat", "Horse", "Camel", "Elephant", "Cat", "Camel", "Goat", "Dog",
				"Camel" };
		String[] newArray = new String[strArray.length];

		for (String str : strArray) {
			System.out.print(str + " ");
		}
		System.out.println("\n");

		int k = 0;

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i; j < strArray.length; j++) {
				if (!strArray[i].contentEquals(strArray[j])) {
					newArray[k] = strArray[j];
					k++;
					System.out.println(strArray[j]);
				}
			}
		}
		for (String str : newArray) {
			System.out.print(str + " ");
		}

		/*
		 * int j = 0; String tempStr = ""; for (String str : strArray) { if
		 * (!tempStr.contentEquals(str)) { for(String str2:newArray) {
		 * 
		 * } tempStr = str; newArray[j] = tempStr; j++; } System.out.print(tempStr +
		 * " "); }
		 */

	}

}
