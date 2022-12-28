package Test_2Loops;
//Q.2- Write a program to find the frequency of each digit in a given integer.
import java.util.Scanner;
public class FrequencyOfEachDigit 
{

	public static void main(String[] args) {
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
	sc.close();
	}
}