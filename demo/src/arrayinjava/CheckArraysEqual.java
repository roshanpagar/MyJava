package arrayinjava;

import java.util.Arrays;

public class CheckArraysEqual { 

    public static void main(String[] args) 

    { 
       int a[] ={10,20,30,40,50};  

        int b[] ={10,20,30,40,50}; 

        boolean result = Arrays.equals(a, b); 

        if (result == true) { 

            System.out.println("Two arrays are equal"); 

        } 

        else { 

            System.out.println("Two arrays are not equal"); 

        } 

     

  /*  int a[] ={10,20,30,40,50};  

    int b[] ={10,20,30,40,50}; 

     for(int i=0;i<b.length;i++)
     {
    	System.out.println(Arrays.toString(b));
    	if(a==b)
    	{
    		System.out.println("Two arrays are equal"); 
    	}
    	else
    	{
    		System.out.println("Two arrays are not equal"); 
    	}
     }*/
}
    }