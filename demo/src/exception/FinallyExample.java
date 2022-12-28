package exception;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1000, b=0;
		
		try
		{
			System.out.println("Division is: "+(a/b));
		}
		
		finally
		{
			System.out.println("Inside Finally block");
		}
		System.out.println("Done..!!!");

	}

}
