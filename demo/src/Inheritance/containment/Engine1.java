package Inheritance.containment;

public class Engine1 {

	private int power , torque;
	private String company;
	
	
	public int getPower()
	{
		return power;
	}
	
	public void setPower(int power)
	{
		this.power=power;
	}
	
	public int getTorque()
	{
		return torque;
	}
	
	public void setTorque(int torque)
	{
		this.torque=torque;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	
	public String toString() 
	{
		return power+" "+torque+" "+company;
	}
}
