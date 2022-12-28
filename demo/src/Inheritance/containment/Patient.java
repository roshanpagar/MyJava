package Inheritance.containment;

public class Patient extends Person2{
	int id,bedno;
	String disease;
	public void setId(int id) {
		this.id = id;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	void dispaly() {
		super.dispaly();
		System.out.println("id: "+id+"\nbedno: "+bedno+"\ndisease: "+disease);
	}
}
