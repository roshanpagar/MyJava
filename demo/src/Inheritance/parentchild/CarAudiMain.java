package Inheritance.parentchild;

public class CarAudiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudiQ8 aq=new AudiQ8();
		aq.setPrice("1.4 cr");
		aq.setEngine("V8 turbo Engin");
		aq.wheelno();
		aq.headlights();
		aq.setwarmer();
		aq.autowiper();
		
		System.out.println(aq.getPrice()+" "+aq.getEngine()+" "+aq.getClass());
		

	}

}
