package Constructors;

import java.util.Scanner;

public class Theater {
	int id ,rating,contact;
	String name,address;
	
	public Theater(int id,String name,String address,int rating,int contact ) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
		this.rating=rating;
		this.contact=contact;
	}
	
	 public String toString()
	 {
		 return id+" "+name+" "+address+" "+rating+" "+contact;
	 }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how any id created : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			
			System.out.println("Enter the id : ");
			int id=sc.nextInt();
			
			System.out.println("Enter the name : ");
			String name=sc.next();
			
			System.out.println("Enter the address : ");
			String address=sc.next();
			
			System.out.println("Enter the rating: ");
			int rating=sc.nextInt();
			
			System.out.println("Enter the contact : ");
			int contact=sc.nextInt();
			
		Theater t=new Theater(id,name,address,rating,contact);
		System.out.println(t);
			
		}
		sc.close();
	}
}
