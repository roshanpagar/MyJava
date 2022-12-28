package Encapsulation;

public class CustomerMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		c1.setAccon(1234);
		c1.setName("Rohit");
		c1.setContact(708350);
		c1.setEmail("rohit55@gmail.com0");
		c1.setBalance(45000);

		Customer c2 = new Customer();
		c2.setAccon(2345);
		c2.setName("Roshan");
		c2.setContact(982247);
		c2.setEmail("roshan123@gmail.com0");
		c2.setBalance(85000);
		
		System.out.println(c1.getName()+" "+c1.getAccon()+" "+c1.getContact()+" "+c1.getEmail());

		System.out.println(c2.getName()+" "+c2.getAccon()+" "+c2.getContact()+" "+c2.getEmail());
		
		System.out.println("Update detail");

		c1.setContact(111111);
		c2.setEmail("rohitw55@gmail.com");
		
		
		System.out.println(c1.getName()+" "+c1.getAccon()+" "+c1.getContact()+" "+c1.getEmail());

		System.out.println(c2.getName()+" "+c2.getAccon()+" "+c2.getContact()+" "+c2.getEmail());
	}

}
