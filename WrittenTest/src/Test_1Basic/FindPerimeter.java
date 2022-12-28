//write a java program to enter lengh and breadth of a rectangle and find its perimeter.
package Test_1Basic;

import java.util.Scanner;

public class FindPerimeter {
	public static void main(String[] args) {
		int lengh, breadth, perimeters;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		lengh=sc.nextInt();
		breadth=sc.nextInt();
		
		perimeters=(lengh+breadth)*2;
		System.out.println("Perimeters is " +perimeters);
		
		sc.close();
		
	}

}
