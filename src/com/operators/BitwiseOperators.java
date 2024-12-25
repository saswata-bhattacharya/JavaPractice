package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 5;
		int number2 = 3;
		int result = number1 & number2; // Bitwise AND
		System.out.println(result);
		result = number1 | number2; // Bitwise OR
		System.out.println(result);
		result = number1 ^ number2; // Ex-OR -- logic building
		System.out.println(result);
		System.out.println(~number1); // Compliment
		System.out.println(5 << 1); // Left shift
		System.out.println(5 >> 1); // Right shift

	}

}
