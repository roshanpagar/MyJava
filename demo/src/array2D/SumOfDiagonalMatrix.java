package array2D;

import java.util.Scanner;

public class SumOfDiagonalMatrix {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int rows=3, cols=3;
			int arr[][]=new int[rows][cols];
			
			System.out.println("Enter the element in matrix: ");
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
			System.out.println("Addition of Diagonals: "+sum);
		}

	}

