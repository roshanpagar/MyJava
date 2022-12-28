package Test_8Array;
/*5.WAP to find min character in character array.
    Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’.
*/
import java.util.Scanner;

public class MinOfArrayChar {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String a=new String();
	
		char min;
		a=sc.next();
		for(int i=0; i>9; i++)
		{
			System.out.println(a.charAt(i));
		}
		
		min=a.charAt(0);	
		for(int i=0;i <a.length(); i++)
		{
			if(a.charAt(i)<min)
			{
			  min=a.charAt(i);
			}
		}
		System.out.println("Minimum Character is "+min);
    }
}


