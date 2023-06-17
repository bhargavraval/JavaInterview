package demo;

import java.util.Arrays;

public class FindMissingIntegerFromArray2 {

	public static void main(String[] args) {
		/*
		 * Find the missing number from the series 1, 2, 3, 4 ,....N
		 */

		// Array with distinct values
		int[] arrInt = { 2, 4, 1, 3, 5, 9, 7, 11, 6, 10 };

		int temp = findMissingNumber(arrInt);

		if (temp != 0) {
			System.out.println("Missing number is: " + temp);
		} else {
			System.out.println("No number is missing");

		}

	}

	private static int findMissingNumber(int[] arrInt) {
		int missingNo = 0;
		int actSum = 0;

		Arrays.sort(arrInt);

		int n = arrInt[arrInt.length - 1];

		int expSum = (n * (n + 1)) / 2;
		System.out.println("Expected Sum: " + expSum);

		for (int i : arrInt) {
			actSum = actSum + i;
		}
		System.out.println("Actual Sum: " + actSum);

		missingNo = expSum - actSum;

		return missingNo;

	}

}
