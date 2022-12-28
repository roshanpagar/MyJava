package Practice;
import java.util.Scanner;

public class StateCapital {
	public static void main(String[] args) {
		String state;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter state name :  ");
		state=sc.next();
		if(state.equals("Maharatra"))
		{
			System.out.println("mumbai");
		}
		else if(state.equals("Karnataka"))
		{
			System.out.println("Bangalore");
		}
		else if(state.equals("Gujarat"))
		{
			System.out.println("GandiNagar");
		}
		else if(state.equals("kerala"))
		{
			System.out.println("triruvatam");
		}
		else
		{
			System.out.println("Invalid state");
		}
		sc.close();
			
	}

}
