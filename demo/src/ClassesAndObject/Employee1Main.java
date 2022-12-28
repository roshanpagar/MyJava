package ClassesAndObject;

public class Employee1Main {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		static int a;
		int b=100;
		static 
		{
		 a=100;
		 System.out.println("static block 1");
		}
		
		static 
		{
			System.out.println("static block 2 " +a);
		}
		
		static 
		{
			System.out.println("static block 3 ");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Employee1.auditorium(); // They do not require object to be called
		Employee1.input();
		
		Employee1 e1= new Employee1(101, "Rohit" , "Hr", 65000);
		Employee1 e2= new Employee1(101, "Roshan" , "marketing", 60000);
		Employee1 e3= new Employee1(101, "Sameer" , "Hr", 68000);

		System.out.println(e1.name+" "+e1.salary+" "+ Employee1.compname);
		
	}

}
