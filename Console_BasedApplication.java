1. Create an menu drive console-based application to register,view,update and delete student details.

package com.student.details;

import java.util.Scanner;

public class Students {

	private int studentID;
	private String studentName;
	private int studentRollNo;
	private int studentAge;
	private String StudentEmail;


	public Students registerStudent() {
		Students student = new Students();
		System.out.println("Enter the following student details:");
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID : ");
		student.studentID = input.nextInt();
		System.out.print("Student Name :");
		student.studentName = input.next();
		System.out.print("Student Roll No : ");
		student.studentRollNo = input.nextInt();
		System.out.print("Student Age : ");
		student.studentAge = input.nextInt();
		System.out.print("Student EmailId : ");
		student.StudentEmail = input.next();

		return (student);
	}

	public void viewStudent(int size, Students students[]) {
		for (int i = 0; i < size; i++) {
			System.out.println("Id        :" + students[i].studentID);
			System.out.println("Name      :" + students[i].studentName);
			System.out.println("Roll No   :" + students[i].studentRollNo);
			System.out.println("Age       :" + students[i].studentAge);
			System.out.println("Email Id  :" + students[i].StudentEmail);
		}
	}
	
	public void deleteStudent(int rollno, Students students[], int size) {
		for (int i = 0; i < size; i++) {
			if (studentID == students[i].studentID) {
				for (int j = i; j < size - 1; j++) {
					students[j] = students[j + 1];
				}
			}
		}
	}

	public void updateStudent(int studentID, Students students[], int size) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			if (studentID == students[i].studentID) {
				System.out.print("Student Name :");
				students[i].studentName = input.next();
				System.out.print("Student Roll No : ");
				students[i].studentRollNo = input.nextInt();
				System.out.print("Student Age : ");
				students[i].studentAge = input.nextInt();
				System.out.print("Student EmailId : ");
				students[i].StudentEmail = input.next();
			}
		}
	}


	public static void main(String args[]) {
		Students students[] = new Students[50];
		Students student = new Students();
		Scanner input = new Scanner(System.in);

		int option;
		int size = 0;
		int id;

		do {
			System.out.println("Select any one option:");
			System.out.println("Press 1 => Register New Student");
			System.out.println("Press 2 => View Student");
			System.out.println("Press 3=> Update Student");
			System.out.println("Press 4 => Delete Student");
			System.out.println("Press 0 => Exist");
			option = input.nextInt();

			switch (option) {
				case 1:
					students[size] = student.registerStudent();
					size++;
					break;
				case 2:
					student.viewStudent(size, students);
					break;
				case 3:
					System.out.print("Enter student Id for update:");
					id = input.nextInt();
					student.updateStudent(id, students, size);
					break;
				case 4:
					System.out.print("Enter student Id for delete :");
					id = input.nextInt();
					student.deleteStudent(id, students, size);
					break;
				case 0:
					System.exit(0);
				default:
					break;
			}
		} while (option != 0);


	}
}