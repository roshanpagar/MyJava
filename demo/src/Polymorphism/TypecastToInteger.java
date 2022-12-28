package Polymorphism;

import java.util.Scanner;

public class TypecastToInteger {
	
	void convert(float a)
	{
		System.out.println("float to integer no is: "+(int)a);
		
	}
	
	void convert(long a)
	{
		
		System.out.println("long to integer no is: "+(int)a);
	}
	
	void convert(double a)
	{
	
		System.out.println("double to integer no is: "+(int)a);
	}
 
	void convert(char a)
	{
		System.out.println("charactor to integer is :"+(int)97);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypecastToInteger t=new TypecastToInteger();
		 
		 t.convert(65.5);
		 t.convert(100);
		 t.convert(233232.3f);
		 t.convert('a');
		
	}

}
