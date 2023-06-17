package demo;

public class SecondLargestNumber {

	// Find a second largest number from the array of integer, return -1, if there
	// is no second largest number

	public static void main(String[] args) {

		int[] arr1 = { 1, 1 }; // -1
		int[] arr2 = { 2, 2, 2 }; // -1
		int[] arr3 = { 1, 2, 1, 2, 1, 2 }; // 1
		int[] arr4 = { 1, 2, 3, 4, 5 }; // 4
		int[] arr5 = { 1 }; // -1
		int[] arr6 = { 1, 1, 1, 1, 2 }; // 1
		int[] arr7 = { 1, 2, 2, 2, 2, 2 }; // 1
		int[] arr8 = { 20, 10, 10, 10, 10, 5, 10 }; // 10
		int[] arr9 = { 7, 34, 34 }; // 7
		int[] arr10 = { -1, -2, -3, -15 }; // -2
		int[] arr11 = { 3 }; // -1

		System.out.println("Second largest number is: " + findSecondLargestNum(arr1));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr2));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr3));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr4));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr5));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr6));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr7));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr8));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr9));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr10));
		System.out.println("Second largest number is: " + findSecondLargestNum(arr11));
	}

	private static int findSecondLargestNum(int[] arr) {
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;
		int lenthArr = arr.length;

		if (lenthArr < 2) {
			secondLargestNum = -1;
			return secondLargestNum;
		} else {
			// Find the largest number
			for (int i : arr) {
				largestNum = Math.max(i, largestNum);
			}
			// System.out.println("Largest number is: " + largestNum);
			for (int j : arr) {
				if (j != largestNum) {
					secondLargestNum = Math.max(j, secondLargestNum);
				}
			}

			if (secondLargestNum == Integer.MIN_VALUE) {
				secondLargestNum = -1;
			}
			return secondLargestNum;
		}
	}
}
