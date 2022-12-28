package whilelopp;

import java.util.Scanner;

public class DoWhileReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev;
		char ch ='n';
		Scanner sc=new Scanner(System.in);
		do {		
				System.out.println("Enter a numbers : ");
				 num=sc.nextInt();
				 rev=0;
				
				while (num!=0)
				{
					int r=num%10;
					rev=rev*10+r;
					num=num/10;
				}
				System.out.println("Reverse is : " +rev);
				System.out.println("Do you want to continue (y/n): ");
				ch=sc.next().charAt(0);
				
				
			}while(ch=='Y'|| ch=='y');


}
}