package arrayinjava;

import java.util.Scanner;

public class PrimeNumberArray {
	void primeNumber(int a[])
	{
	    for (int i=0;i<a.length;i++)
	    {
	    	int mid=a[i]/2;
	    	int j;
	    	for(j=2;j<=mid;j++)
	    	{
	    		if(a[i]%j==0)
	    		{
	    			break;
	    		}
	    	}
	    	if(j>mid)
	    	{
	    		System.out.println(a[i]);
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
		PrimeNumberArray a= new PrimeNumberArray();
		a.primeNumber(arr);

	}

}
