package Abstracttion;

public class CarSwiftMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwiftDezire s= new SwiftDezire(); //child
				
				s.wheelno();
				s.dashboard();
				s.buildQuality();
				s.headlightsno();
				s.safetyFeatures();
				s.wheelAliment();
				
				
				s.setData("1000cc",700000);
				s.displayInfo();                     
	}

}
