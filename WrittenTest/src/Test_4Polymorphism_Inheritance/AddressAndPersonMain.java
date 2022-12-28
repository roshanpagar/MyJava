package Test_4Polymorphism_Inheritance;


public class AddressAndPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1=new Address();
		a1.setCity("Nashik");
		a1.setState("Maharastra");
		a1.setCountry("India");
		
		Person p1=new Person();
	    p1.setName("Rohit");
		p1.setGender("Male");
		p1.setAge(24);
		p1.setAddress("Pimplagaon");
		

		System.out.println(p1.getName()+" "+p1.getGender()+" "+p1.getAge()+" "+p1.getAddress());
		
	}

}

