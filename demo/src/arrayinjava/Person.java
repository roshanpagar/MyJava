package arrayinjava;

import java.util.Arrays;

public class Person {
	int id;
	String name, address;
	IDProof idProof;
	
	Person(int id,String name,String address,IDProof idProof)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.idProof=idProof;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
/*	public IDProof[] getIdproof() {
		return idProof;
	}
	public void setIdproof(IDProof[] idproof) {
		this.idProof = idproof;
	}*/

	public String toString() 
	{
		return id+" "+name+" "+address+" "+Arrays.ToString(idProof);
	}
	
	
}
