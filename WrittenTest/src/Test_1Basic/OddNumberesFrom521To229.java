//Write a program to print odd numbers from 521 to 229 using while loop.
package Test_1Basic;

public class OddNumberesFrom521To229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=521,num2=229 ;
		
		while(num1>=num2)
		{
			if(num1%2!=0)
			{
			System.out.print(num1+"  ");
			}
			
			num1--;
		
		}
	}
}

