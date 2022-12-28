package Inheritance.containment;

public class Engine {
	int power , torque;
	String company;
	
	Engine(int power,int torque,String company)
	{
		this.power=power;
		this.torque=torque;
		this.company=company;
	}
	public String toString()
	{
		return "Power :"+power+"watt\nTorque: "+torque+"nm\nCompany: "+company;
	}
	

}
