package whilelopp;

import java.util.Scanner;

public class PrimeOrNot {
	public static void msin(String[] args)
	{
		int num,i=1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		 num=sc.nextInt();
		
		 
		 while(i<=num)
		 {
			 if (num%i==0)
			 	
		     i++;
		 }
		 if(count==2)
		 {
			 System.out.println("is prime number" +num);
		 }
		 else
		 {
			 System.out.println("is not prime number: " +num);
			 sc.close();
		 }
		 
		 }
	}
	



