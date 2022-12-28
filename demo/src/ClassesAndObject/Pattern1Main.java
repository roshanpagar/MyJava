package ClassesAndObject;

import java.util.Scanner;

public class Pattern1Main {
	
	
	
	public static void main(String[] args) {
   // TODO Auto-generated method stub		
      //  ClassesNmae var_ref= new ClassName();
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Star Pattern \n2. Number Pattern");
		System.out.println("Enter choice : ");
		int ch=sc.nextInt();
		
		Pattern1 p1= new Pattern1();
		
		switch(ch)
		{
		case 1:
			p1.StarPattern();
			break;
			
		case 2:
			p1.numberPattern();
			break;
			
			
			default:
				System.out.println("Enter vaid choice...!!!");
		}
		
	
		
		

	}



}
