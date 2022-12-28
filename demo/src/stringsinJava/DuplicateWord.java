package stringsinJava;

import java.util.Scanner;

public class DuplicateWord {
	    public static void main(String[] args) {  
	       String str;// = "india is my country and india is best country";  
	        int count;  
	       
			Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String");
			str =sc.nextLine();
	
	        str = str.toLowerCase();  
	     
	        String words[] = str.split(" ");  
	          
	        System.out.println("Duplicate words in a given string : ");   
	        for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;  
	                    
	                    words[j] = "0";  
	                }  
	            }  
	           
	            if(count > 1 && words[i] != "0")  
	                System.out.println(words[i]);  
	        }  
	    }  
	}


