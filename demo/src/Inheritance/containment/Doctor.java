package Inheritance.containment;

public class Doctor extends Person2 {
	int id;
	String specialist,lisence;
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	
	void display() {
	super.dispaly();		//void display()
		System.out.println("Id: "+id+"\nSpecilist : "+specialist+"\nLisence:"+lisence);
	}

}
