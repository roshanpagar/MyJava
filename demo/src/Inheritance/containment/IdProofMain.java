package Inheritance.containment;

public class IdProofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		IdProof i1=new IdProof();
		i1.setNumber(1234);
		i1.setName("Rohit");
		i1.setAddress("Pimpalgaon");

		Person1 p1= new Person1();
		p1.setname("Rohit");
		p1.setAge(24);
		p1.setContact("7083507964");
		
		
		
		System.out.println(p1.getname()+" "+p1.getage()+" "+p1.getContact());
		
	
		//System.out.println(p1.getname()+" "+p1.getage()+" "+p1.getContact());
		
	//	System.out.println("Engine Company: "+c1.getE().getCompany());
        System.out.println(p1.geti().getName());




	}

}
