package com.array;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;

		// Array declaration
		int marks[] = new int[3];
//		System.out.println(x);
//		System.out.println(marks);
//		System.out.println((marks.length));

		// Assigning values
		marks[0] = 8;
		marks[1] = 7;
		marks[2] = 6;

		// Traversing an array using for loop
		for (int index = 0; index < marks.length; index++) {
			System.out.println(marks[index]);
		}

	}

}
