package Test_4Polymorphism_Inheritance;
//2.	Create class Person which has attributes (name, gender, age, Address).
//Address is class which has attributes (city, state, country). 
//Display Persons data
//Note. Containment using constructor and getter/setter

public class Address {
	
	private String city, state, country;
    //private Person p;
    
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
    
    public void setCountry(String country)
    {
    	this.country=country;
    }
    
    public String getCountry()
    {
    	return country;
    }
    
    
    
	public String toString() 
	{
		return city +" "+state+" "+country;
	}
}

