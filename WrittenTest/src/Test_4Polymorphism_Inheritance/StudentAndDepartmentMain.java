package Test_4Polymorphism_Inheritance;

public class StudentAndDepartmentMain {

	public static void main(String[] args) {
		
		Department d1=new Department(101,"Civil");
		Student s1=new Student(5,"Rohit",d1);
		
		System.out.println(s1);
		

	}

}
