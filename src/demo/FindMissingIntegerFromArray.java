package demo;

import java.util.Arrays;

public class FindMissingIntegerFromArray {

	public static void main(String[] args) {
		/*
		 * Take integer array input from user array should not contain any duplicate
		 * values write a program to find missing number from a randomly placed series
		 * like 1,2,3,4,5,7,8 Here the missing number is 6 the sequence not necessarily
		 * be maintained in the array
		 */

		// Array with duplicate values
		// int[] arrInt = { 2, 4, 1, 3, 5, 9, 8, 1, 4, 3, 7, 11, 10, 10 };

		// Array with distinct values
		int[] arrInt = { 2, 4, 1, 3, 5, 9, 8, 7, 11, 10 };

		System.out.println("Missing number is: " + findMissingNumber(arrInt));

	}

	private static int findMissingNumber(int[] arrInt) {
		int missingNo = 0;
		for (int temp : arrInt) {
			System.out.println(temp);
		}
		Arrays.sort(arrInt);
		System.out.println("After sort");
		for (int temp : arrInt) {
			System.out.println(temp);
		}

		for (int i = 0; i < arrInt.length - 1; i++) {
			if (arrInt[i + 1] != arrInt[i] + 1 && arrInt[i + 1] != arrInt[i]) {
				missingNo = arrInt[i] + 1;
			}
		}
		return missingNo;

	}

}
