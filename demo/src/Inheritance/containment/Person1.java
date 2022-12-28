package Inheritance.containment;

public class Person1 {
	
	private int age;
	private String name,contact;
	private  IdProof i;
	
	
	
	public void setAge(int age )
	{
		this.age=age;
	}
	public int getage() 
	{
		return age;	
	}
	
	public void setname(String name )
	{
		this.name=name;
	}
	public String getname() 
	{
		return name;	
	}
	
	public void setContact(String contact )
	{
		this.contact=contact;
	}
	public String getContact() 
	{
		return contact;	
	}
	
	
	public String toString()
	{
		return "Nmae:"+name+"\nContact: "+contact+"\nAge: "+age;
	}
	
	public IdProof geti()
    {
   	 return i;
    }

}



