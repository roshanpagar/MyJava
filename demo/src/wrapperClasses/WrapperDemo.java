package wrapperClasses;

// All wrapper classes are final and immutable
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; // boxing /wrapping
       
		Integer it=new Integer(i);  // 1.4 JDK
		
		Integer it1=i;  // autoboxing
		

		Integer it2=new Integer(i);
		System.out.println(it==it2);// ==  memory location
		
		System.out.println(it.equals(it2)); // contents
	
		Integer a=new Integer(1000);
		
		int t=a.intValue();  // int    // unboxing 1.4
		int g=a;  // auto unboxing
		
		Character ch= new Character('s');
		char c=ch;  // autounboxing object>primitive datatype
		
		char x='1';  // primitive datatype-> object
		Character cht=x;   //autoboxing 
				
	}

}
