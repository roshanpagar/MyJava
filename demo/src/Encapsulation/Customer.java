package Encapsulation;

public class Customer {
	
	private int accon, contact,balance;
	private String name, email;
	
	public void setAccon(int accon)
	{
		this.accon=accon;;
	}
	
	public int getAccon()
	{
		return accon;
	}
	
	public void setContact(int contact)
	{
		this.contact=contact;
	}
	
	public int getContact()
	{
		return contact;
	}
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public int getBalance()
	{
		return balance;
	}

	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
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
