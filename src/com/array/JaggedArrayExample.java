package com.array;

import java.util.Arrays;

public class JaggedArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int temp : a) {
			System.out.println(temp);
		}
		System.out.println(Arrays.toString(a));

		int b[][] = new int[2][2];
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

		int j[][] = new int[2][];
		j[0] = new int[] { 10, 20, 30 };
		j[1] = new int[] { 40 };

		System.out.println(j.length);

		// Traversing Jagged array

		for (int rowIndex = 0; rowIndex < j.length; rowIndex++) {
			for (int colIndex = 0; colIndex < j[rowIndex].length; colIndex++) {
				System.out.print(j[rowIndex][colIndex] + " ");
			}
			System.out.println("");
		}

	}

}
