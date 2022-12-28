package Practice;

public class CharCaseChange {
	public static void main(String[] args) {
	
		char ch='A';
		int i=ch ;
		i=i+32;
		System.out.println((char)i);
		char ch1='a' ;   //a=97  A=65 small to capital -32
		System.out.println((char)(ch1-32));
	}
	
	

}
