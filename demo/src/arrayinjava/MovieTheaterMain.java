package arrayinjava;

import java.util.Scanner;

public class MovieTheaterMain {

	private static final int Movie = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Movie mov[]= new Movie[2];
	       Scanner sc= new Scanner(System.in);

			for(int i=0;i<mov.length;i++)
			{
				Theater thet[]= new Theater[3];
				System.out.println("Enter the movie id name releseyear:");
				int mid = sc.nextInt();
				String mname = sc.next();
				String ryear =sc.next();
				System.out.println("Enter the  theter  information :");
				for(int j=0;j<thet.length;j++)
				{
					System.out.println("Enter the thetet info id name,  :");
					int tid=sc.nextInt();
					String tname=sc.next();
					
					//int empNo=sc.nextInt();
					thet[j]= new Theater(tid,tname,thet);
				}
				mov [i]= new Movie(mid,mname,ryear);
			}
			for(Movie m:mov)
			{
    			if(Movie  >=2020)
  				{
					System.out.println(m);
				}
			}*/
		Theater[] theat= new Theater[2];
		
	       Scanner sc= new Scanner(System.in);
		for(int i=0;i<theat.length;i++)
		{
			Movie mov[]= new Movie[2];
			System.out.println("Enter the movie id name releseyear: ");
			int tid=sc.nextInt();
			String tname=sc.next();
			//String rYear=sc.next();
			System.out.println("Enter the  theater  information : ");
			for(int j=0;j<mov.length;j++)
			{
				System.out.println("Enter the thetet info id name: ");
				int mid=sc.nextInt();
				String mname= sc.next();
				String rYear=sc.next();
				mov[i]=new Movie (mid,mname,rYear);
			}
			
			int j;
			theat[j]=new Theater(tid,tname,mov);
		}
		
		for(Theater th:theat)
		{
			System.out.println(th);
		}
	}}
	
