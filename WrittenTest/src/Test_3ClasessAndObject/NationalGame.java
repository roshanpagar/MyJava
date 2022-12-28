package Test_3ClasessAndObject;
/*3.	National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
United States is baseball. Write a Java program to read country name as user-input and to print the
country’s national game. Use switch
*/
import java.util.Scanner;
public class NationalGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country");
		String ch=sc.next();
		
		switch(ch)
		{
			case "India" :
				System.out.println("National game is Hockey");
				break;
				
			case "china" :
				System.out.println("National game is table tennis");
				break;
				
			case "Bangladesh" :
				System.out.println("National game is Kabaddi");
				break;
				
			case "Italy" :
				System.out.println("National game is Football");
				break;
				
			case "United State" :
				System.out.println("National game is baseball");
				break;
				
		    default:
		         System.out.println("Please enter the valid name");
		     
				
		}
		sc.close();

	}

}
