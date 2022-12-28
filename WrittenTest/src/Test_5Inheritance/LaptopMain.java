package Test_5Inheritance;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l= new Laptop();
		l.setNoOfUSBPort(3);
		l.setProcessorSpeed(1200);
		
		//l.display();
		
		//l.getNoOfUSBPort();
		//l.getProcessorSpeed();
		System.out.println("NoOfUSBPort: "+l.getNoOfUSBPort()+"\nProcessorSpeed MHz: "+l.getProcessorSpeed());
	}

}
