package Test_5Inheritance;
/*1.	Create a class Person(id,name,contact,address,idproof[])
Create class IdProof (name,number,validity). Display all the persons
 name contact address who stay in pune and have adhaar card as idproof.
*/

public class IdProof {
	int number;
	String name,validity;
	
	public void setdata(int number,String name,String validity)
	{
		this.number=number;
		this.name=name;
		this.validity=validity;
	}
	public String toString()
	{
		return number+" "+name+" "+validity;
	}

}
