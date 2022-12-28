package Abstracttion;

public abstract class Electronics {
	int price,weight;
	String color;
	
	void processor()
	{
		System.out.println("aaa");
		
	}
	void semiConductor()
	{
		System.out.println("ccc");
	}
	
	abstract void rating();
	abstract void electricityConsumption();
	abstract void fratures();

}
