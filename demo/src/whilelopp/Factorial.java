package whilelopp;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int x, i=1;
		System.out.println("Enter positie Integer");
		x=sc.nextInt();
		System.out.println("Factoriaal of the " +x+" are : ");
		while(i<=x)
		{
			if(x%i==0)
				System.out.println(i+" ");
			
		}
		i++;
	}
	
}

	
	


