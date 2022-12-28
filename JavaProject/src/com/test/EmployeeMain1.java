package com.test;
import java.util.Scanner;
import com.dao.EmployeeOperation1;
import com.pojo.Employee1;

public class EmployeeMain1 {

	public static void main(String[] args) {

      EmployeeOperation1 em = new EmployeeOperation1();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1) Insert \n2) Update \n3) Display \n4) Delete ");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				em.insertEmployee();
				break;
			case 2:
				em.updateSalaryEmployeeData();
				break;
			case 3:
				em.displayEmployeeData();
				break;
			case 4:
				em.deleteEmployee();
				break;
			case 5:
				System.out.println("Exit sucessful");
				break;
				
			 default:
				 System.out.println("Enter valid Number!!!");
			}
			
		} while (choice != 5);

	}

}