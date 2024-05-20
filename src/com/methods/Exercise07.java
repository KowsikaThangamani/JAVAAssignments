package com.methods;

public class Exercise07 {

//	7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades

	public String getStudentGrade (int marks) {
		System.out.println("Getting grades for the mark : " + marks);

		String Grade = "null";

		if (marks >= 91 && marks <= 100) {
			Grade = "AA";
		} else if (marks >= 81 && marks <= 90) {
			Grade = "AB";
		} else if (marks >= 71 && marks <= 80) {
			Grade = "BB";
		} else if (marks >= 61 && marks <= 70) {
			Grade = "BC";
		} else if (marks >= 51 && marks <= 60) {
			Grade = "CD";
		} else if (marks >= 41 && marks <= 50) {
			Grade = "DD";
		} else if (marks <= 40) {
			Grade = "FAIL";
		} else {
			System.out.println("Please pass valid marks");
		}

		return Grade;
	}
	public static void main(String[] args) {

		Exercise07 obj = new Exercise07();

		String grade = obj.getStudentGrade(103);
		System.out.println("The Grade is : " + grade);

	}

}
