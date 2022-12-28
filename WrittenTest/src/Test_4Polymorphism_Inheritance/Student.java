package Test_4Polymorphism_Inheritance;

public class Student {
	
	int rnumber;
	String name;
	Department d;
	 
	public Student(int rnumber ,String name,Department d)
	{
		this.rnumber=rnumber;
		this.name=name;
		this.d=d;
	
	}
	public String toString()
	{
		return "\nRoll no : "+rnumber+"\nStudent Name: "+name+"\nDepartment"+d;
	}

}
