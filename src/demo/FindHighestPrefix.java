package demo;

public class FindHighestPrefix {

	public static void main(String[] args) {

		// Output should be 5
		/*
		 * int X = 100; int Y = 63; int[] intArr = { 100, 63, 1, 6, 2, 16 };
		 */

		// Output should be 13
		int X = 100;
		int Y = 63;
		int[] intArr = { 100, 63, 1, 63, 2, 100, 55, 65, 75, 85, 63, 101, 100, 15, 63, 65 };

		// Output should be -1
		/*
		 * int X = 6; int Y = 13; int[] intArr = { 13, 13, 1, 6 };
		 */

		// Output should be 3
		/*
		 * int X = 7; int Y = 42; int[] intArr = { 6, 42, 11, 7, 1, 42 };
		 */

		// only X present (Output should be -1)
		/*
		 * int X = 100; int Y = 63; int[] intArr = { 100, 62, 1, 6, 2, 16 };
		 */

		// only Y present (Output should be 1)

		/*
		 * int X = 100; int Y = 63; int[] intArr = { 55, 99, 63, 1, 6, 2, 16 };
		 */

		// Both X & Y not present (Output should be 5)
		/*
		 * int X = 100; int Y = 63; int[] intArr = { 99, 62, 1, 6, 2, 16 };
		 */

		// Both X & Y are equal and present only once (Output should be 7)
		/*
		 * int X = 100; int Y = 100; int[] intArr = { 1, 2, 100, 62, 1, 6, 2, 16 };
		 */

		// Both X & Y are equal and present more than once (Output should be 4)
		/*
		 * int X = 100; int Y = 100; int[] intArr = { 100, 62, 100, 6, 6 };
		 */

		System.out.println(findPref(X, Y, intArr));

	}

	private static int findPref(int X, int Y, int[] intArr) {

		int N = intArr.length;
		int result = -1;
		int nX = 0;
		int nY = 0;

		for (int i = 0; i < N; i++) {
			if (intArr[i] == X) {
				nX += 1;
			}

			if (intArr[i] == Y) {
				nY += 1;
			}

			if (nX == nY) {
				result = i;
			}
		}
		return result;

	}

}
