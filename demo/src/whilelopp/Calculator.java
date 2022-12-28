package whilelopp;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		char ch='n';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		do
		{
			System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4.division");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Addition is : "+(a+b));
				break;
				
			case 2:
				System.out.println("Substraction is : "+(a-b));
				break;
				
			case 3:
				System.out.println("Multiplication is : "+(a*b));
				break;
				
			case 4:
				System.out.println("Division is : "+(a/b));
				break;
				
				default : System.out.println("Enter valid option. . .!!");

				
			}
			System.out.println("Do you want to continue: (y/n): ");
			ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		
		
		
	}

		
}
