package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Demo
		int x = 10;
		String name1 = "saswata";
		String name2 = "saswata";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());

		int y = 10;
		System.out.println(x == y);// Value comparison
		System.out.println(name1 == name2);// Reference Hash-code comparison
		System.out.println(name1.equals(name2));// Value comparison
		System.out.println(name1.equalsIgnoreCase(name2));
	}

}
