package demo;

import java.util.ArrayList;

public class ArrayListSort {

	// 2 arraylist of integers
	// add those integers into a new arraylist
	// sort the new arraylist

	public static void main(String[] args) {
		int temp;
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(5);
		arr1.add(2);
		arr1.add(9);
		arr1.add(1);
		arr1.add(7);
		System.out.println("arr1: " + arr1);

		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(3);
		arr2.add(4);
		arr2.add(6);
		arr2.add(2);
		arr2.add(8);
		System.out.println("arr2: " + arr2);

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i : arr1) {
			arr.add(i);
		}

		for (int i : arr2) {
			arr.add(i);
		}

		System.out.println("List before sort: " + arr);

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) > arr.get(j)) {
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		System.out.println("List after sort: " + arr);
	}

}
