package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, a=0, b=0, c=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		System.out.println("Fibonacci Series: ");
		
		for (int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}

}
