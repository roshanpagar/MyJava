package arrayinjava;

public class IDProof {
	String name ;
	int validity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}
	IDProof(String name, int validity)
	{
		this.name=name;
		this.validity=validity;
		
	}
	public IDProof(String name2, String address, IDProof[] ip) {
		// TODO Auto-generated constructor stub
	}
	IDProof()
	{
		this.name=name;
		this.validity=validity;
	}

	public String toString()
	{
		return name+" "+validity;
	}

}
