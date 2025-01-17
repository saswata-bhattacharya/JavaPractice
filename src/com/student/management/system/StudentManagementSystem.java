package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String studentName[] = new String[100]; // Global variable -> Make them public static
	public static int studentAge[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static String studentGrade[] = new String[100];
	public static int studentRollNumber[] = new int[100];
	// Reading values from terminal/console
	public static Scanner scanner = new Scanner(System.in); // Scanner is a class: java.util

	public static int index = 0;

	public static void main(String[] args) {
		// Store the information of Student

		int option;

		System.out.println("**** Student Management System ****");

		while (true) {
			System.out.println("1. Add a Student");
			System.out.println("2. Print Student Details");
			System.out.println("3. Print All Student Details");
			System.out.println("4. Exit");

			System.out.println("Enter an Option [1-4]");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				addStudent(); // Static methods can call another static method
				break;
			case 2:
				printStudentInformation();
				break;
			case 3:
				printAllStudentInformation();
				break;
			case 4:
				exitApp();
				break;
			}
		}

	}

	public static void exitApp() {
		// TODO Auto-generated method stub
		System.out.println("Exiting from the Application.....");
		System.exit(0);

	}

	public static void printAllStudentInformation() {
		// TODO Auto-generated method stub
		System.out.println("Print All Students Information");
		for (int i = 0; i < index; i++) {
			System.out.println("======================================================");
			System.out.println("                                                      ");

			System.out.println("Student Name: " + studentName[i]);
			System.out.println("Student Age " + studentAge[i]);
			System.out.println("Student RollNumber " + studentRollNumber[i]);
			System.out.println("Marks Obtained:  ");

			System.out.println("English: " + marksObtainedInEnglish[i]);
			System.out.println("Maths: " + marksObtainedInMaths[i]);
			System.out.println("Science: " + marksObtainedInScience[i]);
			System.out.println("Student Grade: " + studentGrade[i]);

			System.out.println("                                                      ");
			System.out.println("======================================================");
		}

	}

	public static void printStudentInformation() {
		// TODO Auto-generated method stub
		System.out.println("Print Student Information");
		System.out.println("Enter the index: ");
		int userIndex = scanner.nextInt();

		System.out.println("Student Name: " + studentName[userIndex]);
		System.out.println("Student Age " + studentAge[userIndex]);
		System.out.println("Student RollNumber " + studentRollNumber[userIndex]);
		System.out.println("Marks Obtained:  ");

		System.out.println("English: " + marksObtainedInEnglish[userIndex]);
		System.out.println("Maths: " + marksObtainedInMaths[userIndex]);
		System.out.println("Science: " + marksObtainedInScience[userIndex]);
		System.out.println("Student Grade: " + studentGrade[userIndex]);

	}

	public static void addStudent() {
		System.out.println("Enter the student name: ");
		studentName[index] = scanner.next();

		System.out.println("Enter the student age: ");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter the student roll number: ");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter the marks obtained in english : ");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter the marks obtained in maths : ");
		marksObtainedInMaths[index] = scanner.nextDouble();

		System.out.println("Enter the marks obtained in science : ");
		marksObtainedInScience[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3.0;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D";
		} else if (percentageObtained < 65) {
			studentGrade[index] = "FAIL";
		}
		index++;
		System.out.println("Student info stored successfully.. ");

	}

}
