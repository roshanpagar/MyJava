package Abstracttion;

public class Swift extends Car{
	
	void setData(String engine, int price)
	{
		this.price=price;
		this.engine=engine;
		
	}
	void displayInfo()
	{
		System.out.println("Engine CC: "+engine+" "+"Price: "+price);
	}
	
	void dashboard()
	{
		System.out.println("Swift dashBoard has: AC , Music system, Sreen");
	}
	
	void buildQuality()
	{
		System.out.println("Swift BuildQuality is: 3 Star rated");
	}
    //@Override
	void safetyFeatures() {
	
		System.out.println("Swift saftyFeaturs has : AirBags , Child Lock");
	}
	@Override
	void WheelAliment() {
		// TODO Auto-generated method stub
		
	}
}
