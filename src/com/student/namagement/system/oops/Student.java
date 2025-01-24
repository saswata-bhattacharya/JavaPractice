package com.student.namagement.system.oops;

public class Student {
	private String name;
	private int age;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 10 && age <= 18) {
			this.age = age;
		} else {
			System.out.println("Invalid age for High School");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 0) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid roll no");
		}

	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if(marksObtainedInEnglish >= 0 && marksObtainedInEnglish <=100) {
		this.marksObtainedInEnglish = marksObtainedInEnglish;
	}
		else {
			System.out.println("Invalid Marks");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {

		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("Invalid Marks");
		}

	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("Invalid Marks");
		}

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		return totalMarks;
	}

}
