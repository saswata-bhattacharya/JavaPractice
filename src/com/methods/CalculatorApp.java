package com.methods;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number1;
		int number2;
		number1 = 10;
		number2 = 5;

		double result;

		result = calculateSum(number1, number2); // Method Calling
		System.out.println(result);

		result = calculateSubOfTwoNumbers(number1, number2);
		System.out.println(result);

		result = calculateDivOfTwoNumbers(number1, number2);
		System.out.println(result);

		result = calculateMulOfTwoNumbers(number1, number2);
		System.out.println(result);

	}

	public static double calculateMulOfTwoNumbers(double number1, int number2) {
		double result;
		result = number1 * number2;
		return result;
	}

	public static double calculateDivOfTwoNumbers(double number1, int number2) {
		double result;
		result = number1 / number2;
		return result;
	}

	public static double calculateSubOfTwoNumbers(double number1, int number2) {
		double result = number1 - number2;
		return result;
	}

	public static double calculateSum(double number1, int number2) {
		double result = number1 + number2;
		return result;

	}

}
