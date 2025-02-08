package com.student.namagement.system.oops;

public class Teacher {

	private String name;
	private int age;
	private String address;
	private String contactNumber;
	private String empId;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	private static final double BASE_SALARY = 30000;// CONSTANTS -- final -- static -- UPPER CASE
	private static final double EXPERIENCE_BONUS = 2000;

	public Teacher(String name, int age, String address, String contactNumber, String empId, String subject,
			int yearsOfExperience) {
		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpId(empId)
				&& validateSubject(subject) && validateYearsOfExp(yearsOfExperience)) {

			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			this.empId = empId;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();
		}
	}

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid age for teacher");
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid Teacher Contact Number");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid Teacher Address");
			return false;
		}
	}

	public boolean validateEmpId(String empId) {
		if (empId.matches("T\\d{3}")) {
			return true;
		} else {
			System.err.println("Invalid Teacher Employee ID");
			return false;
		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid Teacher Subject");
			return false;
		}
	}

	public boolean validateYearsOfExp(int yearsOfExp) {
		if (yearsOfExp > 0 && yearsOfExp <= 45) {
			return true;
		} else {
			System.err.println("Invalid Teacher's Years of experience");
			return false;
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
		if (validateAge(age)) {
			this.age = age;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		if (validateEmpId(empId)) {
			this.empId = empId;
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
		}
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExp(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

	public double getSalary() {
		return salary;
	}

	private void calculateSalary() {
		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", empId=" + empId + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + "]";
	}

	public void displayTeacherInfo() {
		System.out.println("--------------- Teacher Information ----------------");
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("ADDRESS: " + address);
		System.out.println("CONTACT NUMBER: " + contactNumber);
		System.out.println("SUBJECT: " + subject);
		System.out.println("YEARS OF EXPERIENCE: " + yearsOfExperience);
		System.out.println("SALARY: "+"$"+ salary );
		System.out.println("====================================================");
	}

}
