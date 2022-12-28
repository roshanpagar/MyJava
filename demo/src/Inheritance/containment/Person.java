package Inheritance.containment;

public class Person {
	
	private int id,age;
	private String name,contact,address;
	private Address a;
	
	public void setId(int id )
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
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
	
	public void setAddress(String address )
	{
		this.address=address;
	}
	public String getAddress() 
	{
		return address;	
	}
	
	public String toString()
	{
		return "Nmae:"+name+"\nContact: "+contact+"\nAddress: "+address;
	}

}
