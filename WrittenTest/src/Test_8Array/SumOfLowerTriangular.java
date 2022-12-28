package Test_8Array;
//2) find sum of lower triangular matrix.
import java.util.Scanner;
public class SumOfLowerTriangular {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 
			int sum = 0;		
			System.out.println("Enter number of rows:  ");
			int rows = sc.nextInt();
			System.out.println("Enter the number of cols: ");
			int columns = sc.nextInt();		
			int arr[][] = new int[rows][columns];
			
			System.out.println("Enter the Matrix:  ");
			for(int i=0; i<rows; i++)
            {
				for(int j=0; j<columns; j++) 
				{
					arr[i][j] = sc.nextInt();
				}		
			}
			
			for(int i= 0; i<rows ; i++)
			{
				for(int j= 0; j<columns; j++)
				{
					if(i>j) {
						sum = sum + arr[i][j];
					}
				}
			}
			System.out.println("Sum of Lower triangular Matrix:  " + sum);
		}
    } 

