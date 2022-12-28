package Practice;
import java.util.Scanner;

public class ForLoopBreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int e=sc.nextInt();
		for(int i=1;i<=e;i++)
		{
			if(i%3==0)
			{
				continue;
				// break;
			}
			System.out.print(i+" ");
		}

		System.out.println("Done");
	}

}
