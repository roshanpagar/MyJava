package Test_3ClasessAndObject;
//1.Create class Box and calculate the volume of box volume=length x width x height (create separate
//  method for volume).

import java.util.Scanner;

public class BoxAndCal {
	 int a,b,c;
	 int volume;
	 
 void volume (int a, int b, int c)
 {
	 volume=a*b*c;
 }
 void display()
 {
	 System.out.println("Volume is : " +volume);
 }
 public static void main(String [] args)
 {
	 int a,b,c;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the length");
	 a =sc.nextInt();
	 System.out.println("Enter the width");
	 b=sc.nextInt();
	 System.out.println("Enter the height");
	 c=sc.nextInt();
	 
	 BoxAndCal b1=new BoxAndCal();
	 b1.volume(a, b, c);
	 b1.display();
	 
	 sc.close();
 }

}
