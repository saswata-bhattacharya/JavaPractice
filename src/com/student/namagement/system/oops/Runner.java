package com.student.namagement.system.oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Debleena", 17,"Kalyannagar, Madanpur","9830468302", 25, 80, 70, 71);

		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();

		Teacher t1 = new Teacher("Ambrij", 30, "Kolkata", "9804068302", "T101", "Dance", 5);
		t1.displayTeacherInfo();
	}

}
