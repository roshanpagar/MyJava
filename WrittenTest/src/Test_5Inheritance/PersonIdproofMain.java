package Test_5Inheritance;

public class PersonIdproofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof i=new IdProof();
		i.setdata(12365,"rohit", "23 dec");
		
		Person p= new Person();
		p.setdata(101,"Roshan","khadkjamb",12365,"Adhar card");
		p.getdata();

	}

}
