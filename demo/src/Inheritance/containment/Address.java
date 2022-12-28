package Inheritance.containment;

public class Address {
	private int pincode;
	private String area, city,state;
	
	
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getPincode()
	{
		return pincode;
	}
	
	public void setArea(String area)
	{
		this.area=area;
	}
	public String getArea() 
	{
		return area;
		
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity() 
	{
		return city;
		
	}
	
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState() 
	{
		return state;
		
	}
	
	public String toString()
	{
		return "Pincode:"+pincode+"\nAre: "+area+"\nCity: "+city+"\nState"+state;
	}
	

}
