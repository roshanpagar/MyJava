package Package1;

public class Test2 extends Test1 {
	void display()
	{
		System.out.println("In test2 display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		System.out.println(t1.a);
		System.out.println(t1.b);//private
		System.out.println(t1.c);
		System.out.println(t1.d);
		
	}

}
