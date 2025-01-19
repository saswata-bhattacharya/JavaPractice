package com.student.namagement.system.oops;

public class Student {
	String name;
	int age;
	int rollNumber;
	double marksObtainedInEnglish;
	double marksObtainedInMaths;
	double marksObtainedInScience;
	String grade;
	
	public void calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		System.out.println("Total Marks Obtained: "+totalMarks);
	}
	

}
