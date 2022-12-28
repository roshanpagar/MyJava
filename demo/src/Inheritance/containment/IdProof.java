package Inheritance.containment;

public class IdProof {

	private int number;
	private String name, address;
	
	
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
		
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	
	
	public String toString()
	{
		return "Number:"+number+"\nName: "+name+"\nAddress: "+address;
	}
	

}
