package Test_8Array;
//1) find sum of main diagonal elements of a matrix.
import java.util.Scanner;
public class SumOfDiagonal {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int rows=3, cols=3;
		int arr[][]=new int[rows][cols];
		
		System.out.println("Enter Matrix: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j]=sc.nextInt();
			}	
		}
	    int sum=0;
		for(int i=0; i<arr.length; i++)
		{
				System.out.print(arr[i][i]+"  ");
				sum=sum+arr[i][i];
				
			System.out.println();
		}
		System.out.println("Sum of Diagonal: "+sum);

	}

}

