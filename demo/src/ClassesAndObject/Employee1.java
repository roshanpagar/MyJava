package ClassesAndObject;

public class Employee1 {

	int id,salary;
	String name, dept;
	static String compname; // class level
	  // static variable are allocated memory only once at the time of class loading 
	
	static void auditorium()
	{
	  System.out.println("auditorium is common for all the employee");	
	}
	
	static void input()
	{
		compname="Infosys";
	}
	
	Employee1(int id, String name, String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
}
