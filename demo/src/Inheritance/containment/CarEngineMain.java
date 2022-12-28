package Inheritance.containment;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1 = new Engine(1000,6,"Tata");
		Engine e2 = new Engine(800,5, "toyata");
		
		Car c1=new Car(1001,"Zest","Tata",700000, e1);
		Car c2=new Car(1002,"egos","Toyata",900000, e2);
		
		
		System.out.println(c1.hashCode());
		System.out.println(c1);
		System.out.println(c2.hashCode());
		System.out.println(c2);
		
	}

}
