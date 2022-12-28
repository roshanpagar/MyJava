package whilelopp;
import java.util.Scanner;


public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		num2=num;
		
		while(num!=0) 
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
			 
		} 
		if(rev==num2)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
		  System.out.println("Not a Palindrome Number");	
		}
		

	}

}
