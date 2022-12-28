package arrayinjava;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[]=new Employee[10];
		
		emp[0]=new Employee(101,"Raj","Manager",70000);
		emp[1]=new Employee(102,"Riya","Developer",65000);
		emp[2]=new Employee(103,"Anjali","Trainee",76000);
	    emp[3]=new Employee(104,"Ram","Networking",78000);
		emp[4]=new Employee(105,"Ankit","Marketing",56000);
		emp[5]=new Employee(106,"Roshan","HR",68000);
		emp[6]=new Employee(107,"Sameer","Developer",54000);
		emp[7]=new Employee(108,"Rohit","HR",87000);
		emp[8]=new Employee(109,"Rahul","Marketing",65000);
		emp[9]=new Employee(110,"Kartik","Hr",45000);
		
		for(Employee e:emp)
		{
			if(e.salary>=60000 && e.dept.equals("HR"))
				System.out.println(e);
			
			if(e.dept.equals("HR"))
			{
				e.hike();
				System.out.println("After hike Salary is: ");
				System.out.println(e);
			}
		}

		
	}




	}
