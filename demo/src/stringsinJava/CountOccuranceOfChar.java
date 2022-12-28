package stringsinJava;
import java.util.Scanner;
public class CountOccuranceOfChar {

	public static void main(String args[])   
	{  
	/*String str="java is a good programming language";  
	int i, len;  
	int counter[] = new int[256];  
	Scanner scanner = new Scanner(System.in);  
	System.out.print("Please enter a string: ");  
	str = scanner.nextLine();  

	len = str.length();  
	
	for (i = 0; i < len; i++)   
	{  
	counter[(int) str.charAt(i)]++;  
	}  

	for (i = 0; i < 256; i++)   
	{  
	if (counter[i] != 0)   
	{  
   
	System.out.println((char) i + " --> " + counter[i]);  
	}  
	}  
	}  */
		
		      
		  String input = "java is a good programming language";
		 // char search = 'a';             // Character to search is 'a'.
		  
		  int count=0;
		  char ch;
		  Scanner sc=new Scanner(System.in);
		  ch=sc.next().charAt(0);
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == ch)
		      count++;
		  }
		  
		  System.out.println(count);
		  }
		
	}

