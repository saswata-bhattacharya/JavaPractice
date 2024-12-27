package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; // Declaration
		a = +5; // Assignment of positive number

		int b;
		b = -a; // -5
		System.out.println("a " + a);
		System.out.println(("b " + b));

		int c;
		c = ++a;// Pre-increment -> Increment first and then use it
		System.out.println("c " + c);
		System.out.println("a " + a);

		c = --a;// Pre-decrement -> Decrement first and then use it
		System.out.println("c " + c);
		System.out.println("a " + a);

		c = a++;// Post-increment -> Use first then increment the value
		System.out.println("c " + c);
		System.out.println("a " + a);

		c = a--;// Post-decrement -> Use first then decrement the value
		System.out.println("c " + c);
		System.out.println("a " + a);

		boolean isStatus = false;
		isStatus = !isStatus; // ! (not) unary operator
		System.out.println(isStatus);
	}

}
