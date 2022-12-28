package Test_6Abstraction;
/*4.Create interface IceCream with method eat and Juice with method drink.  
Create class Mastani which implements both interfaces.*/
interface Icecream
{
	void eat();
}
interface Juice
{
	void drink();
}

public class Mastani implements Icecream, Juice
{
	public void eat()
	{
		System.out.println("Eating Icecream is not good in winter");
	}
	
	public void drink()
	{
		System.out.println("Drinking juice everyday is good for health");
	}

}
