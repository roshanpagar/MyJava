package Test_4Polymorphism_Inheritance;
/*3.	Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
(b) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value
*/

public class Compare {

	    public void compare(int a, int b) {
	        
	        if (a < b) {
	            System.out.println(b+"Is greater");
	        }
	        else {
	            System.out.println(a+"Is greater");
	        }
	        
	    }
	    
	    public void compare(char a, char b) {
	        int x = (int)a;
	        int y = (int)b;
	        
	        if (x < y) {
	            System.out.println(b+"Is greater");
	        }
	        else {
	            System.out.println(a+"Is greater");
	        }
	        
	    }
	    
	 /*   public void compare(String a, String b) {
	        
	        int l1 = a.length();
	        int l2 = b.length();
	        
	        if (l1 > l2) {
	            System.out.println(a);
	        }
	        else {
	            System.out.println(b);
	        }

	    }*/
}    
	   
