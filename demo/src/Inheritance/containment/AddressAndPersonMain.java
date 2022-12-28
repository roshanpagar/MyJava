package Inheritance.containment;

public class AddressAndPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1=new Address();
		a1.setCity("nashik");
		a1.setCity("pimplgoan");
		a1.setPincode(422209);
		a1.setArea("Maharastra");

		Person p= new Person();
		p.setId(101);
		p.setAddress("at post nashik");
		p.setAge(24);
		p.setname("Rohit");
		p.setContact("7083507964");
		
		
		//System.out.println(p.getname()+" "+p.getContact()+" "+p.getAddress());
		
	/*	
		System.out.println(c1.getName()+" "+c1.getPrice());
		System.out.println("\n Engine Details : ");
	//	System.out.println("Engine Company: "+c1.getE().getCompany());
        System.out.println("power: "+c1.getE().getClass());
       // System.out.println("Torque: "+);
*/	}
	}


