package demo;

public class SecondLargestNumber2 {

	public static void main(String[] args) {

		int[] a = { -5, -4, -3 };
		//int[] a = { 1, 1 }; // -1
		//int[] a = { 2, 2, 2 }; // -1
		//int[] a = { 1, 2, 1, 2, 1, 2 }; // 1
		//int[] a = { 1, 2, 3, 4, 5 }; // 4
		//int[] a = { 1 }; // -1
		//int[] a = { 1, 1, 1, 1, 2 }; // 1
		//int[] a = { 1, 2, 2, 2, 2, 2 }; // 1
		//int[] a = { 20, 10, 10, 10, 10, 5, 10 }; // 10
		//int[] a = { 7, 34, 34 }; // 7
		//int[] a = { -1, -2, -3, -15 }; // -2
		//int[] a= { 3 }; // -1

		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int temp;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				temp = max;
				max = a[i];
				second_max = temp;
			} else if (a[i] > second_max && a[i] != max) {
				second_max = a[i];
			}
		}
		if (second_max == Integer.MIN_VALUE) {
			System.out.println("No Second Highest value");
		} else {
			System.out.println(second_max);
		}
	}

}
