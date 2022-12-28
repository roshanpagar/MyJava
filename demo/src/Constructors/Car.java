package Constructors;

public class Car {

	int id,price;
	String name ,company;
	
	Car()    // classname()  simple constructors
	{
      id=-1;
      price=-1;
      name="nnnn";
      company="cccc";
	}
	
	void show()
	{
		int a=0,b=0;
		System.out.println(a+ " "+b);
		System.out.println(id+" "+name);
	}
	 public String toString()
	 {
		 return id+" "+name+" "+company+" "+price ;
	 }
	
	public static void main(String [] args)
	{
		Car c1= new Car(); //car c1 = new Constructors;
		Car c2=new Car();
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
