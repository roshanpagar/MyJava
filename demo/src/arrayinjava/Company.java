package arrayinjava;

import java.util.Arrays;
public class Company {
	
	int id;
	String name;
	Department dept[];
	
	Company(int id,String name,Department dept[])
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(dept)+"\n";
	}
}