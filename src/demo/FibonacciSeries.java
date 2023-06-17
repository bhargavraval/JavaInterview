package demo;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 1;

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			x = y;
			y = z;
			z = x + y;
			System.out.print(x + " ");
		}
	}

}
