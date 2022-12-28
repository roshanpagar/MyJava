package array2D;
import java.util.Scanner;
public class SumOfUpperTriangle {


	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int i, j, rows, columns, sum = 0;
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Please Enter UT Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the UT Matrix Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < rows ; i++)
		{
			for(j = 0; j < columns; j++)
			{
				if(j > i) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("\n The Sum of Upper Triangle Matrix =  " + sum);
	}
}
