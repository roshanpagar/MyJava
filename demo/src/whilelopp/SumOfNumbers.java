
package whilelopp;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		
		int start,end,sum=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strat and end : ");
		start=sc.nextInt();
		end=sc.nextInt();
		
		while(start<=end)
		{
		   if(start%2==0)
		   {
			   sum=sum+start;
		   }
		  
		   start ++;
		}
		
		  System.out.println("Addition of even no is : " +sum);
		  
		sc.close();
	}
}