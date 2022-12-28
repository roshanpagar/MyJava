package Encapsulation;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		
		e1.setId(101);
		e1.setName("Rohit");
		e1.setDept("HR");
		e1.setEmail("rohitw540@mail.com");
		
		
	Employee e2=new Employee();
		
		e2.setId(102);
		e2.setName("Roshan");
		e2.setDept("Finace");
		e2.setEmail("roshan123@mail.com");
		
		System.out.println(e1.getName()+" "+e1.getDept()+" "+e1.getEmail());
		System.out.println(e2.getName()+" "+e2.getDept()+" "+e2.getEmail());
		
		
	}

}
