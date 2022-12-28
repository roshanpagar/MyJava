package Inheritance.parentchild;

public class Father1 extends Grandfather {
	String fName1;

	public void setFName1(String fName1) {
		this.fName1 = fName1;
	}

	void display()
	{
		super.display();
		System.out.println(fName1+" "+super.fName+" "+Grandfather.lname);
	}

}
