package Constructors;

public class ABC {
	
	public ABC()
	{
		// TODO Auto-generated constructor stub
	   this(10);
	   System.out.println("Inside simple constructor");
	}
	
	ABC(int x)
	{
		//this("ABC");
		System.out.println("Inside 1 parameter constructor");
	}
	
	ABC(int x , int y )
	{
		this("ABC");
		System.out.println("Inside 2 parameter constructor");
	}
	
	ABC(String z)
	{
		this(10);
		System.out.println("Inside String parameter constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
