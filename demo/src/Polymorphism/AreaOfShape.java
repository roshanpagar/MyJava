package Polymorphism;


public class AreaOfShape {
	
	void area(int b,double h)
	{
	   System.out.println("Area of circle is: " +(3.14f*b*h));
	}
	 
	void area(int w , int h)
	{
		System.out.println("Ara of rectangle is " +(w*h));
	}
		
	void area(float a, float b)
	{
		System.out.println("Area of tringle " +(a/b/2));
	}
	
	void area(double b)
	{
		System.out.println("Squrea " +(b*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaOfShape a1= new AreaOfShape();
		
		a1.area(10);
		a1.area(10,20);
		a1.area(10,2.5);
		a1.area(2.3f,4.5f);
		
		
		
		
		
	}

}



