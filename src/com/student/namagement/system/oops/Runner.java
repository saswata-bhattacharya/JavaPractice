package com.student.namagement.system.oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();

		s1.setName("Debleena");
		s1.setAge(12);
		s1.setRollNumber(5);
		s1.setMarksObtainedInEnglish(77);
		s1.setMarksObtainedInMaths(85);
		s1.setMarksObtainedInScience(95);
		s1.setGrade("A");
		

		System.out.println("Student Name: " + s1.getName());
		System.out.println("Student Age: " + s1.getAge());
		System.out.println("Student Roll Number: " + s1.getRollNumber());
		System.out.println("Student Marks in English: " + s1.getMarksObtainedInEnglish());
		System.out.println("Student Marks in Maths " + s1.getMarksObtainedInMaths());
		System.out.println("Student Marks in Science: " + s1.getMarksObtainedInScience());
		System.out.println("Student's Grade: " + s1.getGrade());
		System.out.println("Total Marks Obtained by Student: "+s1.calculateTotalMarks());

	}

}
