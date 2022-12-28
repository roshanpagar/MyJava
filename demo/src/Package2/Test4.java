package Package2;
 
import Package1.*;
public class Test4 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test4 t4=new Test4();
		System.out.println(t4.a);//default
		System.out.println(t4.b);//private
		System.out.println(t4.c);
		System.out.println(t4.d);
		
	}

}
