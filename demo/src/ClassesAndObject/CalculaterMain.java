package ClassesAndObject;
import java.util.Scanner;
public class CalculaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c1=new Calculater();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the choice : \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Square Root");
		int a=sc.nextInt();
		
		switch(a) {
		case 1 : c1.addition();
		        break;
		        
		case 2 : c1.subtract();
                break;
        
		case 3 : c1.multiply();
                break;
        
		case 4 : c1.division();
                break;
        
		case 5 : c1.sqrroot();
                break;
                
         default : System.out.println("Enter valid number...!!");
		}
         sc.close();
	}

}
