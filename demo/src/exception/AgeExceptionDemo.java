package exception;

import java.util.Scanner;

public class AgeExceptionDemo 
{
	void ageCheck(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Age is less... soory not allowed");
			
		}
		else if(age>=60)
		{
			throw new AgeException("Age is greatr ... Sorry not allowed");
		}
		else
			System.out.println("Enjoy your ride..!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		AgeExceptionDemo ad=new AgeExceptionDemo();
		try
		{
			ad.ageCheck(age);
		}catch(AgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
