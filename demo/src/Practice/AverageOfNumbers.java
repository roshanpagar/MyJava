package Practice;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		int a,b,c,d,e,total;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no1");
		a=sc.nextInt();
		System.out.println("Enter no2");
		b=sc.nextInt();
		System.out.println("Enter no3");
		c=sc.nextInt();
		System.out.println("Enter n04");
		d=sc.nextInt();
		System.out.println("Enter n05");
		e=sc.nextInt();
		total=(a+b+c+d+e)/5 ;
		//int avg=total/5;
		System.out.println("Average is :" +total+ " is positive");
		
	}

}

