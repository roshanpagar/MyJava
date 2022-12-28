package arrayinjava;


public class Department {
	
	int id,empNo;
	String name;
	
	Department(int id,String name,int empNo)
	{
		this.id=id;
		this.name=name;
		this.empNo=empNo;
	}
	
	public String toString()
	{
		return id+" "+name+" "+empNo;
	}

}
