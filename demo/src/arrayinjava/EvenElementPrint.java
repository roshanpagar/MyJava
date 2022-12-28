package arrayinjava;

import java.util.Scanner;

public class EvenElementPrint {
	void evenElementprint(int a[])
	{
	   	for (int i=0;i<a.length;i++)
	   	{
	   		if(i%2==0) {
	   			System.out.println("Element: "+a[i]+" "+"index: "+i);
	   		}
	   	}
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
		EvenElementPrint even=new EvenElementPrint();
		even.evenElementprint(arr);
	}

}
