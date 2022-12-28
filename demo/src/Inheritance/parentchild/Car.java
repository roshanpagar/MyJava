package Inheritance.parentchild;

public class Car{
	String price,engine;
	
	void wheelno()
	{
		System.out.println("4wheels");
	}
	
	void headlights()
	{
		System.out.println("worm white");
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
