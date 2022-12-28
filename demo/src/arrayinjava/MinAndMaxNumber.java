package arrayinjava;
import java.util.*;
public class MinAndMaxNumber {
	   
	   /* public static void findMinAndMax(int[] nums)
	    {

	        int max = nums[0];
	        int min = nums[0];
	 
	        for (int i = 1; i < nums.length; i++)
	        {
	
	            if (nums[i] > max) {
	                max = nums[i];
	            }
	            else if (nums[i] < min) {
	                min = nums[i];
	            }
	        }
	 
	        System.out.println("The minimum array element is " + min);
	        System.out.println("The maximum array element is " + max);
	    }
	 */
	    public static void main(String[] args)
	    {
	    
	    	Scanner inp=new Scanner(System.in);
	    	System.out.print("\n Enter Size of Array: ");
	    	int n=inp.nextInt();
	    	int i,sum=0;
	    	int arr[]=new int[n];   //Creating N-size Array
	    	for(i=0;i<n;i++)   //Entering N numbers in array
	    	{
	    	System.out.print("\n Enter: ");
	    	arr[i]=inp.nextInt();
	    	}
	    	int max=arr[0],min=arr[0];  //Initializing with first element.
	    	for(i=0;i<n;i++)
	    	{
	    	if(arr[i]>max)   //Checking Maximum element
	    	max=arr[i];
	    	if(arr[i]<min)  //Checking Minimum element
	    	min=arr[i];
	    	}
	    	//Printing Result
	    	System.out.println("\n Maximum Number: "+max);
	    	System.out.println("\n Minimum Number: "+min);
	    	}
	    }
	


