package com.student.namagement.system.oops;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private String address;
	private String contactNumber;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private double totalMarks;
	private double percentage;
	private String grade;

	public Student(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInMaths,
			double marksObtainedInScience) {
		if ((validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInScience)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInEnglish))) {
			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;
		}
	}

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

	public boolean validateAge(int age) {
		if (age < 21 && age >= 10) {
			return true;
		} else {
			System.err.println("Invalid age for Student");
			return false;
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber <= 100) {
			return true;
		} else {
			System.err.println("Invalid roll number for Student");
			return false;
		}
	}

	public boolean validateMarks(double marksForTheSubjects) {
		if (marksForTheSubjects >= 100 || marksForTheSubjects < 0) {
			System.err.println("Invalid marks for Student");
			return false;
		} else {
			return true;
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
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
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

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage == 0) {
			grade = "Cannot be calculated";
		} else {
			if (percentage >= 95) {
				grade = "A+";
			} else if (percentage >= 90) {
				grade = "A";
			} else if (percentage >= 85) {
				grade = "B+";
			} else if (percentage >= 80) {
				grade = "B";
			} else if (percentage >= 75) {
				grade = "C+";
			} else if (percentage >= 70) {
				grade = "C";
			} else if (percentage >= 65) {
				grade = "D+";
			} else if (percentage >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + ", grade=" + grade + "]";
	}

}
