package Test_4Polymorphism_Inheritance;
/*1.	WAP to have Department class created with id, name .
Student class has roll, name and Department object should have id and name. 
Assign and print individual values in main method*/

public class Department {
	int id;
	String dname;
	
	public Department(int id,String dname) 
	{
	  this.id=id;
	  this.dname=dname;
	}
	
	public String toString()
	{
		return "\nID : "+id+" "+"\nDepartment Name: "+dname;
	}

}
