package com.test;
import com.dao.EmployeeOperation;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
	  EmployeeOperation em= new EmployeeOperation();
		em.mainArray();
		em.displayEmployeeData();
		em.insertEmployee();
		em.displayEmployeeData();

		em.updateSalaryEmployeeData();
		em.displayEmployeeData();
		
		em.deleteEmployee();
		em.displayEmployeeData();
		
		em.insertEmployee();
		em.displayEmployeeData();   			
	
	}


}

