package Test_6Abstraction;

public class MachineJuiceMain {

	public static void main(String[] args) {
		
	Juicer j=new Juicer();
	{
		j.crush();
		j.rotate();
		j.filter();
		
		System.out.println("reate an object of type juicer with reference variable of machine");
		Machine m1 =new Juicer();
		m1.crush();
		m1.rotate();
		
	}
																
			}
	}

