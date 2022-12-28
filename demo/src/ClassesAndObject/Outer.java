package ClassesAndObject;

public class Outer {
	
	int a=100;
	static int b=200;
	
	//non-static: can access static as well as non-static directly
	
	void display()
	
	{
		System.out.println(a+" "+b);
	}
	
	//Static : can access only static directly
	//         to access member it required an object
	
	static  void show()
	{
		//System.out.println(a+" "+b); //error
		Outer o=new Outer();
		System.out.println(o.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o=new Outer();
		o.display();
		o.show();

	}

}
