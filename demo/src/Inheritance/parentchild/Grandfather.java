package Inheritance.parentchild;

public class Grandfather {
	String fName,mName;
	static String lname="Watpade";
	
	
	
    public void setfName(String fName) {
		this.fName = fName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}


	void display() {
	System.out.println("First name: "+fName+"\nMiddle name: "+mName+"\nLast name:"+lname);
	}
}

