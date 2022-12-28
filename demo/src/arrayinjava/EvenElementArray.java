package arrayinjava;

import java.util.Scanner;

public class EvenElementArray {

	public static void main(String[] args)
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the size of array: ");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter the elements of array: ");
			
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Array elemrnts are: ");
			for (int i=0;i<size;i++)
			{
				if(arr[i]%2==0)
				{
				System.out.print(arr[i]+" ");
				}
				}
		}
	
	}


