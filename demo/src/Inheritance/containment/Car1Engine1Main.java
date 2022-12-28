package Inheritance.containment;

public class Car1Engine1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine1 e1 = new Engine1();
		
		e1.setPower(1000);
		e1.setTorque(5);
		e1.setCompany("Tata");
		
		Car1 c1=new Car1();
		c1.setId(1001);
		c1.setName("Zest");
		c1.setPrice(800000);
	   //c1.setE(e1);
		
		System.out.println(c1.getName()+" "+c1.getPrice());
		System.out.println("\n Engine Details : ");
	//	System.out.println("Engine Company: "+c1.getE().getCompany());
        System.out.println("power: "+c1.getE().getClass());
       // System.out.println("Torque: "+);
	}

}
