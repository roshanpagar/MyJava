package arrayinjava;

import java.util.Scanner;

public class AdditionOfElement {
	 void additionElement(int a[])
	{
		 int sum=0;
		 for (int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println("The sum is: "+sum);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		 
		 int arr[]=new int[size];
		 
		 System.out.println("Enter the element of array: ");
		 for(int i=0;i<size;i++)
		 {
			 arr[i]=sc.nextInt();
		 }

		 AdditionOfElement add=new AdditionOfElement();
		 add.additionElement(arr);
	}

}
