package arrayinjava;

import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		
		int n=a.length;  //6
		int mid=n/2;    //3
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<mid;i++) // i=0      i=1            i=2
		{
			int temp=a[i];//temp=10        temp=20         temp=30
			a[i]=a[n-i-1];//a[0]=a[5]=60   a[1]=a[4]=50    a[2]=a[3]=40
			a[n-i-1]=temp;//a[5]=10        a[4]=20         a[3]=30
		}
		System.out.println(Arrays.toString(a));

	}

}
