package exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=200,b=0;
		int ar[]= {10,20,30,40,50,60};
			String s="India";
			String st=null;
					
			try
			{
				try
				{
					try
					{
						try
						{
							System.out.println("Division is:"+(a/b));
						}
						catch(ArithmeticException e)
						{
							e.printStackTrace();
						}
						System.out.println("Element at index:"+ar[8]);
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						e.printStackTrace();
						
					}
					System.out.println("Char At:"+s.charAt(9));
				}
				catch(StringIndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
				System.out.println(st.length());
				}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			System.out.println("Done....Nested try catch");
			}
			}