package Practice;

import java.util.Scanner;

public class GreaterNumber {
	
	public static void main(String[] argd) {
		
		int a,b,c,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		a=sc.nextInt();
		System.out.println("Enter a num2");
		b=sc.nextInt();
		System.out.println("Enter a num3");
		c=sc.nextInt();
		System.out.println("Enter a num4");
		d=sc.nextInt();
		
	if(a>=b && b>=c && a>=d)
	{
		System.out.println(a+ " is greatest");
	}
	else if(b>=a && b>=c && b>=d)
	{
		System.out.println(b+ " is greatest");
	}
	else if(c>=a && c>=b && c>=d)
	{
		System.out.println(c+ " is greatest");
	}
	else
	{
		System.out.println(d+ " is grestest");
	}
	sc.close();
	
}

}


