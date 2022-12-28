package arrayinjava;

import java.util.Arrays;

public class RepeatElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,10,40,10,20,30,10};
		
		System.out.println(Arrays.toString(arr));
		for(int i=0   ;i<arr.length-1;i++)
		{
			for (int j=i+1 ;j<arr.length-1;j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println("Same element in array :"+arr[i]);
				}
			}
		}

	}

}
	
	


