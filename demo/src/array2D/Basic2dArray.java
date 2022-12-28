package array2D;

import java.util.Scanner;

public class Basic2dArray {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int a[][]=new int[r][c];
	
		System.out.println("Enter the arrayelements: ");
		
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<3;i++)
		{
			int sum1=0;
			for(int j=0;j<3;j++)
			{
				sum1=sum1+a[i][j];
			}
			System.out.println("Addition of row element is: "+sum1);
		}
		/*for(int i=0;i<3;i++)
		{
			int sum1=0;
			for(int j=0;j<3;j++)
			{
				sum1=sum1*a[i][j];
			}
			System.out.println("Multiplication of row element is: "+sum1);
		}*/
		}
		
	}


