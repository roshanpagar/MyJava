package Abstracttion;

public abstract class Car { //can not create of abstract class
	
	int price;
	String engine;
	// constructors are allowed in abstract class
	
	void wheelno()
	{
		System.out.println("Every car has 4 wheels");
	}
	
	void headlightsno()
	{
		System.out.println("There are 2 headlights in car");
	}
	
	abstract void dashboard();
	abstract void safetyFeatures();
	abstract void buildQuality();
	abstract void WheelAliment();
	

}
