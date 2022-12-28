package Test_5Inheritance;

public class TestingEmp1Main extends Employee {
	double b = 1500;
	double temp = sal + b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestingEmp1Main e = new TestingEmp1Main();
		System.out.println("Salary is: " + e.sal);
		System.out.println("extra Bonas is: " + e.b);
		System.out.println("Total salary is: " + e.temp);

	}

}
