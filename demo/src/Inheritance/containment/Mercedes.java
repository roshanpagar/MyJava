package Inheritance.containment;

public class Mercedes extends Car3 {
	
	void dashboard()
	{
		System.out.println("Screen");
		super.dashboard(); // willalways represent immediate parent class
	}
	
	void enginepower()
	{
		System.out.println("Mercedes: 11906 cc");
	}

}
