package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// Store the information of Student

		String studentName = "Samriddhi";
		int studentAge = 17;
		double marksObtainedInEnglish = 77.5;
		double marksObtainedInScience = 80;
		double marksObtainedInMaths = 75;
		String studentGrade = "A";
		int studentRollNumber = 22;

		System.out.println("**** Student Management System ****");

		Scanner scanner = new Scanner(System.in); // Scanner is a class: java.util

		System.out.println("Enter the student name: ");
		studentName = scanner.next();

		System.out.println("Enter the student age: ");
		studentAge = scanner.nextInt();

		System.out.println("Enter the student roll number: ");
		studentRollNumber = scanner.nextInt();

		System.out.println("Enter the marks obtained in english : ");
		marksObtainedInEnglish = scanner.nextDouble();

		System.out.println("Enter the marks obtained in maths : ");
		marksObtainedInMaths = scanner.nextDouble();

		System.out.println("Enter the marks obtained in science : ");
		marksObtainedInScience = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		double percentageObtained = totalMarksObtained / 3.0;

		if (percentageObtained >= 95) {
			studentGrade = "A+";
		} 
		else if (percentageObtained >= 90) {
			studentGrade = "A";
		}
		else if (percentageObtained >= 85) {
			studentGrade = "B+";
		}
		else if (percentageObtained >= 80) {
			studentGrade = "B";
		}
		else if (percentageObtained >= 75) {
			studentGrade = "C";
		}
		else if (percentageObtained >= 65) {
			studentGrade = "D";
		}
		else if (percentageObtained < 65) {
			studentGrade = "FAIL";
		}
		

		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age " + studentAge);
		System.out.println("Student RollNumber " + studentRollNumber);
		System.out.println("Marks Obtained:  ");

		System.out.println("English: " + marksObtainedInEnglish);
		System.out.println("Maths: " + marksObtainedInMaths);
		System.out.println("Science: " + marksObtainedInScience);
		System.out.println("Student Grade: " + studentGrade);

	}

}
