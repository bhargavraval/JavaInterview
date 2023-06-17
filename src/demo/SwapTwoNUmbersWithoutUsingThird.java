package demo;

public class SwapTwoNUmbersWithoutUsingThird {

	public static void main(String[] args) {

		int x = 15;
		int y = 25;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x);
		System.out.println(y);

	}

}
