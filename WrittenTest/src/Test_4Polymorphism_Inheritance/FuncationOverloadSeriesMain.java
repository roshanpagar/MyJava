package Test_4Polymorphism_Inheritance;

import java.util.Scanner;

public class FuncationOverloadSeriesMain {
	 public static void main(String args[]) {
	    	FuncationOverloadSeries fo=new FuncationOverloadSeries();
	    	Scanner sc=new Scanner (System.in);
	    	System.out.println("Enter the value");
	    	double n1=sc.nextDouble();
	    	fo.series(n1);
	    	System.out.println(fo.series(n1));
	    	
	    	System.out.println("Enter the value");
	    	double n2=sc.nextDouble();
	    	System.out.println("Enter the secount value");
	    	double n3=sc.nextDouble();
	    	
	    	fo.series(n2, n3);
	    	System.out.println(fo.series(n2,n3));

}
	 }