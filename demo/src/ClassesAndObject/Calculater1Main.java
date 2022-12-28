package ClassesAndObject;
import java.util.Scanner;
public class Calculater1Main {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Numbers : ");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	
	Calculater1 c1=new Calculater1();
	
	System.out.println("Select the choice : \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Square Root");
	System.out.println("Enter choice");
	int ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
	c1.add(n1, n2);
	break;
	case 2:
	c1.sub(n1, n2);
	break;
	case 3:
	c1.mul(n1, n2);
	break;
	
	default:
		System.out.println("Enter the valid choice...!!!");
	
	sc.close();
	}
	

}
}