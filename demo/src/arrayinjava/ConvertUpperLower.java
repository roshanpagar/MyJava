package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertUpperLower {
	void caseChanging(char a[])
	{
		System.out.println("Orginal Arry : \n"+Arrays.toString(a));
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i]=((char) (a[i]-32));
			}
			else if(a[i]>='A' && a[i]<='Z')
			{
				a[i]=((char) (a[i]+32));
			}
		}
		System.out.println("New Array: \n"+Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		ConvertUpperLower c=new ConvertUpperLower();
		char[] a = null;
		c.caseChanging(null);
		

	}

}
