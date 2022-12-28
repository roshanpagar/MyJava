package Inheritance.parentchild;

public class Child extends Father1{
	
	String fName2;

	public void setFName2(String fName2) {
		 this.fName2=fName2;
	}
	
	void display() {
		super.display();
		//System.out.println("child Info : ");
		System.out.println(fName2+" "+super.fName1+" "+Grandfather.lname);
	}
	

}
