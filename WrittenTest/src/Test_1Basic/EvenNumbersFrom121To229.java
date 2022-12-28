package Test_1Basic;

//import java.util.Scanner;

public class EvenNumbersFrom121To229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int start , end ;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the strat and end : ");
//		start=sc.nextInt();
//		end=sc.nextInt();
//		while(start<=end)
//		{
//			if(start%2==0)
//			{
//			System.out.print(start+" ");
//			}
//			start++;
//		}
//		System.out.println("Done");
//		sc.close();

		int a=121,b=229;
		System.out.println("Enter numbers between 121to229 : ");
		
		while(a<b)
		{
			if(a%2==0)
			{
				System.out.print(a+ "  ");
			}
			a++;
		}
	}

}

