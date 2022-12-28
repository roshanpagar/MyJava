package com.dao;

import java.util.Arrays;
import java.util.Scanner;
import com.pojo.Student;

public class StudentOperation {

	Student stu[] = new Student[3];
	Scanner sc = new Scanner(System.in);

	public void mainArray() {

		System.out.println("Student size: ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter id, name, dept, mraks, contact, email ");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int marks = sc.nextInt();
			String contact = sc.next();
			String email = sc.next();

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			s.setContact(contact);
			s.setEmail(email);

			stu[i] = s;
		}
	}

	public void insertStudent() {
		System.out.println("Enter id, name, dept, mraks, contact, email to insret the Student data");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		int marks = sc.nextInt();
		String contact = sc.next();
		String email = sc.next();

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setMarks(marks);
		s.setContact(contact);
		s.setEmail(email);

		for (int i = 0; i < stu.length; i++) {
			if (stu[i] == null) {
				stu[i] = s;
				break;
			}

		}
	}

	public void displayStudentData() {
		System.out.println(Arrays.toString(stu));
	}

	public void updateStudentData() {
		System.out.println("Enter the id, contact to update the Student data");
		int id = sc.nextInt();
		String contact = sc.next();

		for (Student s : stu) {
			if (s != null) {
				if (s.getId() == id) {
					s.setContact(contact);

				}
			}
		}
	}

	public void searchStudentData() {
		Student s[] = new Student[stu.length];
		System.out.println("Enter the id to search Student data");
		int id = sc.nextInt();

		int index = 0;
		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getId() == id) {
				System.out.println("Id " + stu[i].getId() + " Marks: " + stu[i].getMarks() 
						+ " Contact: "+ stu[i].getContact() + " Name: " + stu[i].getName()
						+ " Dept: " + stu[i].getDept() + " Email: " + stu[i].getEmail());
					break;
			}
		}
	}

}