package com.test;

import java.util.Scanner;
import com.dao.StudentOperation;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentOperation st = new StudentOperation();

		int choice = 0;
		do {
			System.out.println("Curd Operation");
			System.out.println("\n1)Insert \n2)Update \n3)Search \n4)Display \n5)Exit");
			System.out.println("Enter the choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				st.insertStudent();
				break;
			case 2:
				st.updateStudentData();
				break;
			case 3:
				st.searchStudentData();
				break;
			case 4:
				st.displayStudentData();
				break;
			case 5:
				System.out.println("Exit Successfully ");
				break;
			}
		} while (choice != 5);
	}
}