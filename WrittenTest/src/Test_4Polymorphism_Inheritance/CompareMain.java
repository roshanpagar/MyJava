package Test_4Polymorphism_Inheritance;

import java.util.Scanner;

public class CompareMain {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        Compare obj = new Compare();
	        
	        System.out.print("Enter first integer: ");
	        int n1 = in.nextInt();
	        System.out.print("Enter second integer: ");
	        int n2 = in.nextInt();
	        obj.compare(n1, n2);
	        
	        System.out.print("Enter first character: ");
	        char c1 = in.next().charAt(0);
	        System.out.print("Enter second character: ");
	        char c2 = in.next().charAt(0);
	        in.nextLine();
	        obj.compare(c1, c2);
	        
	      /*  System.out.print("Enter first string: ");
	        String s1 = in.nextLine();
	        System.out.print("Enter second string: ");
	        String s2 = in.nextLine();
	        obj.compare(s1, s2);*/
	    }


}
