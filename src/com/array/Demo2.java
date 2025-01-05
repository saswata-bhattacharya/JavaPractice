package com.array;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int marks[]=new int[3];
		
		//Declaring and assigning values 
		int marks[]= {8,7,6};
		
		// Traversing an array using for loop
//		for (int index = 0; index < marks.length; index++) {
//			System.out.println(marks[index]);
//		}
		
		//Enhanced for loop Or for each loop -> Used for traversing
		for(int temp: marks) {
			System.out.println(temp);
		}
		

	}

}
