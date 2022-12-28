package Test_2Loops;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Numbers");
		int num=sc.nextInt();
		int product=1;
		int rem;
		
		for(product=1;num!=0; num=num/10)
		{
			rem=num%10;
			product=product*rem;
		}
		System.out.println(product);
		sc.close();
	}
	

}
