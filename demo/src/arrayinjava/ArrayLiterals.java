package arrayinjava;

public class ArrayLiterals {
	void arrayLength(int a[])
	{
		System.out.println("Length of array is: "+a.length);
	}

	void arrayElements(int a[])
	{
		System.out.println("ArrayElements are: ");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	
	void searchElement(int a[],int element)
	{
		int cnt=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element is present at index: "+i);
			}
			else
			  cnt++; 
		}
		if(cnt==a.length)
			System.out.println("Element not present");
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,40,50,60,70,80,90,100,60,60};
		ArrayLiterals ar=new ArrayLiterals();
		ar.arrayLength(arr);
		ar.arrayElements(arr);
		ar.searchElement(arr, 60);
	}

}
