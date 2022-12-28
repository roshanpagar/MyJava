package StringBufferBuilder;

import java.util.Scanner;

public class StringBufferAndBuilder {
	public static void main(String args[]) {
		
		StringBuffer sbf1=new StringBuffer();
		sbf1.ensureCapacity(50);
		System.out.println(sbf1.capacity());
		
		String s="Java Language";
		
		StringBuffer sbf=new StringBuffer("Java Language"); //16 defualt
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		sbf.append(s1);*/
		
		System.out.println(sbf);
		
		s.concat("Core");
		System.out.println("string: "+s);
		
		sbf.append(" core");
		System.out.println("String Buffer: "+sbf);
		//System.out.println(sbf.length());
		//System.out.println(sbf.capacity());
		
		/*sbf.reverse();
		System.out.println(sbf);*/
		                    
		sbf.deleteCharAt(2);   
		System.out.println(sbf);
		
		sbf.delete(5,9); //end-start  character Starting with start 9=5=4
		System.out.println(sbf);
		
		sbf.setCharAt(2,'H');
		System.out.println(sbf);
		
		sbf.insert(1,"ava");
		System.out.println(sbf);
	}

}
