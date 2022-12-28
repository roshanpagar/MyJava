package Test_5Inheritance;

public class Laptop {
 int noOfUSBPort,processorSpeed;

public int getNoOfUSBPort() {
	return noOfUSBPort;
}

public void setNoOfUSBPort(int noOfUSBPort) {
	this.noOfUSBPort = noOfUSBPort;
}

public int getProcessorSpeed() {
	return processorSpeed;
}

public void setProcessorSpeed(int processorSpeed) {
	this.processorSpeed = processorSpeed;
}
 
 void display()
 {
	 System.out.println(noOfUSBPort+" "+processorSpeed);
 }
 
}
