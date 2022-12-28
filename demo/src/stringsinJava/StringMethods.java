package stringsinJava;

public class StringMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       //  0123
		String s1="Java";
		String s2="Language is good";
		String s3="java";
		String s4="Java";

		String s5= new String("Java");
		
		System.out.println(s1==s5);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//concatination
		
		System.out.println(s1+" Core");
		System.out.println(s1.concat(s2));
		/*
		s1= s1.concat("Language");
		System.out.println(s1);*/
		
		//Comparison compareTo
		//their there the  the their there
		
		System.out.println(s3.compareTo(s1));
		// ascii value  -ve   2>1
		//+ve 1>2
		//0  1=2
		
		System.out.println(s1.compareToIgnoreCase("there"));
		//                                                   0123456789
		System.out.println("CharAt: "+s2.charAt(8));   //s2="Language is good"
		
		System.out.println("Contains: "+s2.contains("god"));//1 character or more than  1
		
		System.out.println("Starts with: "+s2.startsWith("Le")); //1 character or more than  1
		
		System.out.println("Ends With: "+s2.endsWith("ood"));
		                                                     //  0123456789
		System.out.println("Index of: "+s2.indexOf("is"));  //s2="Language is good"   character/String
		
		System.out.println("Last Index of: "+s2.lastIndexOf('g'));  //character/String
		
		System.out.println(s1.replace('a', 'A')); //s1=Java
		System.out.println(s1);
		        // 0123456789
		String s6="Concatination";
		
		System.out.println(s6.substring(7)); //7 - end of string
		System.out.println(s6.substring(4,10)); //10-4= 6 characters starting with index 4
		
		System.out.println(s6.toLowerCase());
		System.out.println(s6.toUpperCase());
		
		
	}

}


