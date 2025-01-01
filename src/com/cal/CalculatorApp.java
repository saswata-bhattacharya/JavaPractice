package com.cal;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number1;
		int number2;
		number1 = 10;
		number2 = 5;

		double result;
		
		CalculateSum(); // Method Calling
		
		result = number1 - number2;
		System.out.println(result);

		result = number1 / number2;
		System.out.println(result);

		result = number1 * number2;
		System.out.println(result);

	}
	
	public static void CalculateSum() {
		double result = 10+55;
		System.out.println(result);
		
	}

}
