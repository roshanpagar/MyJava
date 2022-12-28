package whilelopp;
import java.util.Scanner;

public class MenuAndPrice {
	public static void main(String[] args) {
		
		char ch='n';
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("***** Welcome to Hotel ***** \n1. Maharashtrian Thali 250 \n2. Gujrati Thali 200 \n3. Chinese Thali 180 \n4. Rajastani Thali 350 \n5.Punjabi Thali  225");
			System.out.println("Enter your choice: ");
			
			int choice=sc.nextInt();
			System.out.println("Enter Quantity: ");
			int a=sc.nextInt();
		
		
		
			switch(choice)
			{
			case 1:
				System.out.println("Gujrati Thali : "+(a*250));
				break;
				
			case 2:
				System.out.println("Gujrati Thali : "+(a*200));
				break;
				
			case 3:
				System.out.println("Chinese Thali : "+(a*180));
				break;
				
			case 4:
				System.out.println("Rajastani Thali : "+(a*350));
				break;
				
			case 5:
				System.out.println("Punjabi Thali : "+(a*225));
				break;
				
				default : System.out.println("Enter valid Order. . .!!");

				
			}
			System.out.println("Do you want to continue: (y/n): ");
			ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		
		
		
	}

		
}