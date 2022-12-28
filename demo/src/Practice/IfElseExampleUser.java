package Practice;
import java.util.Scanner;

public class IfElseExampleUser {
	public static void main(String[] argd) {
	 int num ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		
		if(num%2==0 && num>0)
		{
			System.out.println("even number and positive number");
			
		}
		else
		{
			System.out.println("Even and negativ number");
		}
		sc.close();
	}

}
