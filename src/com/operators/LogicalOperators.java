package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical Operators - Multiple conditions
		// Logical AND: && --> All the conditions needs to be true
		//Logical OR:|| --> At least one condition needs to be true
		//Logical NOT: ! --> Inversion
		
		System.out.println((5>4) && (5<2)); 
		System.out.println((5>4) || (5<2)); 
		System.out.println(!((5>4) || (5<2)));

	}

}
