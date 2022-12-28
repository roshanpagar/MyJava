package Inheritance.containment;

public class Car1 {

	private int id,price;
	private String name,cname;
	private Engine e;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getcname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
     public Engine getE()
     {
    	 return e;
     }


}
