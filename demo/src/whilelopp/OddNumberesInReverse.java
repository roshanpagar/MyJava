
package whilelopp;

import java.util.Scanner;

public class OddNumberesInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start , end ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strat and end : ");
		start=sc.nextInt();
		end=sc.nextInt();
		while(end>=start)
		{
			if(end%2!=0)
			{
			System.out.print(end+" ");
			}
			end --;
		}
		System.out.println("Done");
		sc.close();

	}

}