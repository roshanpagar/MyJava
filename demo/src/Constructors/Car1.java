package Constructors;

import java.util.Scanner;

public class Car1 {
	
	int id,price;
	String name , company;
	
	Car1()
	{
		id=-1;
		price=-1;
		name="nnnn";
		company="cccc";
		
		
	}
	void show()
	{
		int a=0,b=0;
		System.out.println(a+ " "+b);
		System.out.println(id+" "+name);
	}
	
	Car1(int id, String name ,String company,int price)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
	}
	public String toString()
	{
		return id+" "+name+" "+company+" "+price ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
        int id,price;
        String name,company;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id");
        id=sc.nextInt();
        
        
        c.show();
        c.toString();
		
	}

}
