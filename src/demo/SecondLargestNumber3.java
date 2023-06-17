package demo;

public class SecondLargestNumber3 {

	public static void main(String[] args) {

		int[] num = { 978, 4, 1, 7, 3, 119, 6, 12, 556, -1, 695 };

		// First find the largest number in the array
		int largestNumber = getLargest(num);
		System.out.println("Largest number is: " + largestNumber);

		// Find the second largest number
		System.out.println("Second largest number is: " + getSecondLargest(num, largestNumber));
	}

	public static int getLargest(int[] a) {
		int largestNum = 0;
		System.out.println("Count of numbers: " + a.length);
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largestNum) {
				largestNum = a[i];
			}
		}
		return largestNum;
	}

	public static int getSecondLargest(int[] a, int largestNum) {
		int secondLargestNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < largestNum && a[i] > secondLargestNum) {
				secondLargestNum = a[i];
			}
		}
		return secondLargestNum;
	}

}
