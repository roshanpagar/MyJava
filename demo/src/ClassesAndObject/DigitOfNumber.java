package ClassesAndObject;
import java.util.Scanner;
public class DigitOfNumber {

	void productofdigit()
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int pro=1;
		
		    while (num > 0)
		   {
				pro = pro * (num % 10);
				num = num / 10;
		   }
			System.out.println(pro);
	
	}


    void additionofdigit()
    {
    	int num,sum=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		num=sc.nextInt();
		
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("Addidtion is : " +sum);

      }
    
     void frequencyofdigit()
     {
    	 Scanner sc = new Scanner(System.in);
 		System.out.println("Enter THe Number");
 		int num = sc.nextInt();
 		System.out.println("Digit \t Frequency");
 		int digit = 0;
 			for (int i = 0; i <= 9; i++) 
 			{
 				int cnt = 0;
 				int temp = num;
 			while (temp > 0)
 			{
 			    digit = temp % 10;
 			if (digit == i) 
 			{
 			    cnt++;
 			}
 			   temp = temp / 10;
 			}
 			if (cnt > 0) {
 			   System.out.println(i + " \t " + cnt);
 			}
 		}
 	}
   }
   
