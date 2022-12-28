package Inheritance.parentchild;
// final can be use with variable,method,class
//final,finally,finalize;
public class Aa //final class cannot be inherited
{
  final int a=100;  //Constant
  static String city="Aurangabad";
  final void display() // that method cannopt be overridden
  {
	  System.out.println("In display method...!!! " +a);
  }
}
class Bb extends Aa
{
	void display1()
	{
		//a=200;
		city="sambhaji Nagar";
		System.out.println("In b class display method...!!! "+a);
	}


public static class FinaMain{
	public static void main(String[] args)
	{
		Bb obj=new Bb();
		obj.display1();
		System.out.println("Aa.city");
		
	}
}
}