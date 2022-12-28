package exception;

public class FindTheException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=200,b=3;
		int ar[]= {10,20,30,40,50,60,70};
		String s="India";
		String st=null;
		
		try 
		{
			System.out.println("Division is: "+(a/b));
			System.out.println("Element at index: "+ar[2]);
			System.out.println("Char At: "+s.charAt(2));
			System.out.println(st.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Done");
		System.out.println("Multiple catch");

	}

}
