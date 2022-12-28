package Practice;
import java.util.Scanner;



public class Calculator {
	public static void main(String[] args) {
		
		int choice,a,b ;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		System.out.println("Enter a two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition is : " +(a+b));
		
		case 2:
			System.out.println("Enter a two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Subtracton is : " +(a-b));


		case 3:
			System.out.println("Enter a two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Multiplication is : " +(a*b));
			
		case 4:
			System.out.println("Enter a two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Division is : " +(a/b));
			
			
			sc.close();
		}
		
	}

}
