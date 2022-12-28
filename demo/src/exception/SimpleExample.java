package exception;

public class SimpleExample {
	void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	void divide(int a,int b)
	{
		System.out.println("Divide is: "+(a/b));
	}
	
	void multiply(int a,int b)
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	
	void substract(int a,int b)
	{
		System.out.println("Substraction is: "+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=150,b=0;
		SimpleExample s= new SimpleExample();
		
		s.add(a, b);
		try 
		{
			s.divide(a, b);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
		}
		
		s.multiply(a, b);
		s.substract(a, b);
		
	}

}
