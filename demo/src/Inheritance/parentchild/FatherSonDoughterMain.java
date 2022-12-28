package Inheritance.parentchild;

public class FatherSonDoughterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s= new Son();
		s.setName("Rohit");
		s.setAge(24);
		
		System.out.println("Son Information");
		System.out.println(s.getName()+" "+s.getAge());
		s.address();
		s.education();
	}

}
