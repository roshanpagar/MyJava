
package whilelopp;

import java.util.Scanner;

public class SumOfMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,sum=0 ,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		num=sc.nextInt();
		
		while(num!=0)
		{
			int r=num%10;
			product=product*r;
			//sum=sum+r;
			num=num/10;
			
			//mul=sum*r;
		}
		System.out.println("multiplication is : " +product);

	}

}
