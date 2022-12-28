package ClassesAndObject;

import java.util.Scanner;

public class DigitOfNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Product of digit of number \n2. Addition of digit of number \n3. Frequency of digit of number");
		System.out.println("Enter choice : ");
		int ch=sc.nextInt();
		
		DigitOfNumber p1= new DigitOfNumber();
		
		switch(ch)
		{
		case 1:
			p1.productofdigit();
			break;
			
		case 2:
			p1.additionofdigit();
			break;
			
			
		case 3:
			p1.frequencyofdigit();
			
			break;
			
			default:
				System.out.println("Enter vaid choice...!!!");
		}
		
	
		
		

	}



}


	


