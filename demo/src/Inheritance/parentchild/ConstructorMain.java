package Inheritance.parentchild;

class A
{
	A()
	{
	  System.out.println("Inside class A Constructor");	
	}
}

class B extends A
{
	B()
	{
		//super  //represent A class
		System.out.println("inside class B constructor");
	}
}

class C extends B
{
	C()
	{
		//super  //represent B class
		System.out.println("inside class Constructor");
		
	}
}
public class ConstructorMain {

	public static void main(String [] args)
	{
		// parent class default constructor
		C c1=new C();
	}
}
