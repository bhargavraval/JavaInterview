package demo;

import java.util.HashSet;
import java.util.Set;

public class FindSmallestPositiveInteger {

	public static void main(String[] args) {

//		int[] intArr = { 1, 3, 6, 4, 1, 2};
//		int[] intArr= {-1,-3};
//		int[] intArr = { 1, 3 };
		int[] intArr = { 10, 8, 11, 18, 15, 5, 1, 2, 3, 8, 4, 5, 6, 7 };

		System.out.println("Smallest positive number not present in array is: " + findRequredNum(intArr));

	}

	private static int findRequredNum(int[] intArr) {
		int num = 0;
		Set<Integer> intSet = new HashSet<>();

		for (int temp : intArr) {
			if (temp > 0) {
				intSet.add(temp);
			}
		}
		System.out.println(intSet.size());
		System.out.println(intSet);
		for (int i = 1; i <= intSet.size() + 1; i++) {
			System.out.println(i);
			if (!intSet.contains(i)) {
				num = i;
				break;
			}
		}
		return num;
	}

}
