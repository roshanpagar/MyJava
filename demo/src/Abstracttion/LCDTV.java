package Abstracttion;

public class LCDTV extends Electronics {
	 
	void setData(int price, int weight,String color)
	{
		this.price=price;
		this.weight=weight;
		this.color=color;
	}
	void displayInfo()
	{
		System.out.println("Price: "+price+" "+"Weight: "+weight+" "+"Color"+color);
	}

	void rating()
	{
		System.out.println("LCD is 5 Rating TV");
	}
	
	void electricityConsumption() {
		System.out.println("LCD ");
	}
	
	 
	@Override
	void fratures() {
		 System.out.println("LCD Featurs is: bluetooth connection, wifi,youtube ");
		// TODO Auto-generated method stub
		
	}
}
