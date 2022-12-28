package Inheritance.containment;

public class Person3DoctorMain {

	public static void main(String[] args) {
		
		System.out.println("----Doctor Detail----");
		
		Doctor d=new Doctor();
		d.setName("Rohit");
		d.setAge(24);
		d.setGender("Male");
		d.setContact("56757");
		d.setId(101);
		d.setSpecialist("nuero");
		d.setLisence("yes");
		d.display();
		
		System.out.println("----Patient detail----");
		Patient p1=new Patient();
		p1.setName("Roshan");
		p1.setAge(25);
		p1.setGender("Male");
		p1.setContact("7687678");
		p1.setId(123);
		p1.setBedno(5);
		p1.setDisease("Maleriya");
		p1.dispaly();
	}
}
