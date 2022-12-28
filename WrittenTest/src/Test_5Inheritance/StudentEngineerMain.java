package Test_5Inheritance;

public class StudentEngineerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e=new Engineer();
		e.setrNo(101);
		e.setName("Rohit");
		e.setAge(24);
		e.setClassName("Mca");
		e.setStream("s");
		//e.display();
		
		System.out.println("Id: "+e.getrNo()+"\nname: "+e.getName()+"\nAge: "+e.getAge()+"\nClassname: "+e.getClassName()+"\nSream: "+e.getStream());

		
	}

}
