package Abstracttion;

interface A
{
	void add(int a,int b);
	void sqrt(int a);
}

interface B
{
	void square(int a);
	void sqrt(int a);
}

class ABC implements A,B
{
	public void add(int a , int b)
	{
		System.out.println("Addition is: "+(a+b));
	}


	public void square(int a)
	{
		System.out.println("Square is: "+(a*a));
	}

	@Override
	public void sqrt(int a) 
	{
		System.out.println("Square root is: "+Math.sqrt(a));
	}
}
public class MultipleMain {

	public static void main(String[] args) {
	
		ABC obj=new ABC();
		obj.add(100,200);
		obj.sqrt(25);
		obj.square(45);
		

	}

}
