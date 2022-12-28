package Practice;
import java.util.Scanner;

public class VowelSwich_2 {


public static void main(String[] args) {
		
		char ch;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a charactor: ");
		ch=input.next().charAt(0);
       
		switch(ch) {
		
		case 'a':
		  
		case 'e':
		 
		case 'i':
		   
		case 'o':
		 
		case 'u':
		
		case 'A':
		
		case 'E':
		
		case 'I':
		
		case 'O':
		 
		case 'U':
		    System.out.println("Vowel");
		    break;
		    
		 default:
			 System.out.println("Consonant");
		    
		    
		}
		
		input.close();
}
}
