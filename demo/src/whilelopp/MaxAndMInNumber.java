package whilelopp;

import java.util.Scanner;

public class MaxAndMInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		int num=sc.nextInt();
		int max=num%10;
		int min=num%10;
		
		while(num!=0)       // num 3452       num= 345     num=34    num= 3    num=0
		{
			int r= num%10;  //  r=3452%10=2   r=5         r=4         r=3
			
			if(r>max)       // r>2            r>2         r>5         r>5
			{
				max=r;      //                max=5
			} 
			if(r<min)       //  r<2                      r>2           r<2
			{
				min=r;
			}
			num=num/10; // num=3452/10=345  num=345/10=34  num=34/10=3 num=3/10=0
			
		}
		System.out.println("maximum number is: " +max);
		System.out.println("minimum number is: " +min);

	}

}
