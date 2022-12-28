package Encapsulation;

public class Employee {
	
	private int id,salary;
	private String name,dept,email;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}

	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
}
