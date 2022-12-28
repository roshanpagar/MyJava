package Test_5Inheritance;

public class Person {
	int id ,contact;
	String name, address;
	static String idproof="Adhar card" ;
	
	public void setdata(int id,String name,String address,int contact, String IdProof  )
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.idproof=idproof;
	}
	
	public void getdata()
	{
		System.out.println("Id: "+id+"/nname : "+name+"\ncontact: "+contact+"\nAddress: "+address+"\nIdProof: "+idproof);
	}
}
