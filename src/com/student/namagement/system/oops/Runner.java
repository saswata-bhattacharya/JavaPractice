package com.student.namagement.system.oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Uday", 17, 25, 80, 70, 71);

		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		System.out.println(s1);

		Student s2 = new Student("Saswata", 23, 27, 80, 80, 80);
		s2.calculateTotalMarks();
		s2.calculatePercentage();
		s2.calculateGrade();
		System.out.println(s2);

	}

}
