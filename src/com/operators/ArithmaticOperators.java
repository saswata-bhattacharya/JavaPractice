package com.operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mathematical Operations: +,-,*,/,%

		int number1 = 10;
		int number2 = 20;

		double result;

		result = number1 + number2;
		System.out.println(result);
		result = number1 - number2;
		System.out.println(result);
		result = number1 * number2;
		System.out.println(result);
		result = ((double) number1) / number2; // Implicit type casting
		System.out.println(result);
		result = number1 % number2;
		System.out.println(result);

	}

}
