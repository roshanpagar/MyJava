package Practice;
import java.util.Scanner;


public class AverageOfMarks {
	
	public static void main(String[] args) {
		int a,b,c,d,e,total;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a s1 marks");
		a=sc.nextInt();
		System.out.println("Enter a s2 marks");
		b=sc.nextInt();
		System.out.println("Enter a s3 marks");
		c=sc.nextInt();
		System.out.println("Enter a s4 marks");
		d=sc.nextInt();
		System.out.println("Enter a s5 marks");
		e=sc.nextInt();
		total=(a+b+c+d+e)/5;
		{
		System.out.println("Average Marks is :" +total);
		}
		sc.close();
	}
	

}


