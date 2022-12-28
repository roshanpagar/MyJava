package stringsinJava;
import java.util.Scanner;
public class min {
	


		public static void main(String args[])
	    {
	       
	        //********* START: PLEASE DO NOT CHANGE ANY CODE LINES GIVEN BELOW
	       //DO NOT WRITE ANY EXTRA PRINT or SCAN STATEMENT
	       int min=Integer.MAX_VALUE;
	      int max=Integer.MIN_VALUE;

	        int arr[]=new int [5];
	       Scanner sc= new Scanner(System.in);
	       for(int i=0;i<arr.length;i++)
	      {
	           arr[i]=sc.nextInt();
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	         else if (arr[i]<min)
	         {
	           min=arr[i];
	         }
	         
	      }
	        
	       
	        // ***************** END: UNTIL THIS LINE
	     
	       // START: WRITE YOUR LOGIC BELOW THIS STATEMENT
	    	
	    	
	        
	      	// END: WRITE YOUR LOGIC ABOVE THIS STATEMENT
	      System.out.println(min+" "+max);
	    }

	}


