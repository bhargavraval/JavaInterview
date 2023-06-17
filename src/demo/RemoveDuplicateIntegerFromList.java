package demo;

import java.util.ArrayList;

public class RemoveDuplicateIntegerFromList {

	public static void main(String[] args) {

		ArrayList<Integer> intArry = new ArrayList<>();
		intArry.add(1);
		intArry.add(2);
		intArry.add(10);
		intArry.add(2);
		intArry.add(10);
		intArry.add(3);
		intArry.add(3);
		intArry.add(3);
		intArry.add(4);
		intArry.add(5);
		intArry.add(5);
		intArry.add(10);

		System.out.println("Original list: " + intArry);
		System.out.println("Unique list: " + getUniqueList(intArry));
	}

	private static ArrayList<Integer> getUniqueList(ArrayList<Integer> intArry) {
		ArrayList<Integer> intArry2 = new ArrayList<>();
		for (int i = 0; i < intArry.size(); i++) {
			if (!intArry2.contains(intArry.get(i))) {
				intArry2.add(intArry.get(i));
			}
		}
		return intArry2;
	}
}
