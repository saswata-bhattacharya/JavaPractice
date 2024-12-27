package com.conditional;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage = 180;
		char grade;

		if (percentage >= 90 && percentage < 100) {
			grade = 'A';
		} else if (percentage >= 80 && percentage < 90) {
			grade = 'B';
		} else if (percentage >= 70 && percentage < 80) {
			grade = 'C';
		} else if (percentage >= 60 && percentage < 70) {
			grade = 'D';
		} else if (percentage < 60) {
			grade = 'F';
		} else {
			grade = ' ';
			System.out.println("Something went wrong. Percentage value should be less than 100");
		}
		System.out.println("Percentage -> " + percentage);
		System.out.println("Grade -> " + grade);

	}

}
