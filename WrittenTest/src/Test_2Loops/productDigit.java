package Test_2Loops;
//Q.1- Write a program to calculate the product of digits of any number.
import java.util.Scanner;
public class productDigit {

   public static void main(String[] args)
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
		sc.close();
   }
}
