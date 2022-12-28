package arrayinjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,50,30,20,40,60,9,8};
		//char arr[]= {'z','d','p','e','s','x','b','g','a'};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
				   int temp=arr[j]; // integer Array
				 //char temp=arr[j];  // charectorArray
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("second maximum marks: "+arr[arr.length-2]);
		
		System.out.println("Second minimum marks is : "+arr[1]);
	}

}
