package Polymorphism;

public class Addition {
	
	void add(int a, int b) 
	{
		System.out.println("Addition of two integers is : " +(a+b));
	}
	void add(String a,String b)  // data type is different
	{
		System.out.println("Addition of Sting is : " +(a+b));
		
	}
	
	void add(int a, int b, int c ) //  No of parameters are different
	{
		System.out.println("Addition 3 integer parameters is : "+(a+b+c));
	}
	
	void add(int id, String name) //
	{
		System.out.println("Addition of String and int is :"+id+" "+name);
	}
	void add(String name, int marks) // Sequence of parameters is different
	{
		System.out.println("Addition of string and integer is : "+name+" "+marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1= new Addition();
		 a1.add(100,200);
		 a1.add(10, "rohit");
		 a1.add("rohit", 55);
		 a1.add(100, 200,300);
		 
	}

}
