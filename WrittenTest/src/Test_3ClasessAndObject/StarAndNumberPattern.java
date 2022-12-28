package Test_3ClasessAndObject;

/*2. Draw the patterns create a separate method for each:
*
**
***
****
0
11
000
1111*/


public class StarAndNumberPattern {
	
	void starpattern()
	{
		for (int i=1;i<=4;i++)
		{
		  for (int j=1;j<=i;j++)	
		  {
		
		 System.out.print("*");
		}
		  System.out.println();
		}
	}
	
	void numberpattern()
	{
		for (int i=0;i<=4;i++)
		{
		  for (int j=0;j<=i;j++)	
		  {
		    if(i%2==0)
		
			System.out.print(0);
		  
		    else
		  
		    System.out.print(1);
	      }
		  System.out.println();
		}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StarAndNumberPattern n1= new StarAndNumberPattern();
		n1.starpattern();
		n1.numberpattern();
		

	}

}
