import java.util.Scanner;
public class AddNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			add+=i;
			System.out.println(add);
		}
		

	}

}
