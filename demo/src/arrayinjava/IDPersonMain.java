package arrayinjava;

import java.util.Scanner;

public class IDPersonMain {

	public static void main(String[] args) {
		
		Person p[]=new Person[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<p.length;i++)
		{
			IDProof ip[]=new IDProof[2];
			System.out.println("Enter id proof detail idname validity");
			String id=sc.next();
			String name1=sc.next();
			String address=sc.next();
			
			for(int j=0;j<ip.length;j++)
			{
				System.out.println("Enter the person detail id name Address");
				
				String name=sc.next();
				int validity=sc.nextInt();
				
				ip[j]=new IDProof(name,validity);
			}
			String address1;
			p[i]=new Person(id,name1,address1,ip);
			
		}
		
		for(Person a1:p)
		{
			Object idProof;
			for(IDProof q:idProof)
			{
				if(q.getName().equalsIgnoreCase("pancard"))
				{
					System.out.println("");
				}
			}
		}
	}

}
