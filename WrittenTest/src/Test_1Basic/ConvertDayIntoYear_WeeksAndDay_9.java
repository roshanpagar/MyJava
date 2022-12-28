package Test_1Basic;
import java.util.Scanner;

//Write a java program to convert day into year, weeks and days.

public class ConvertDayIntoYear_WeeksAndDay_9 {
	public static void main(String[] args) {
		int ndays , days, weeks , years;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a days : ");
		ndays=sc.nextInt();
		
		years = ndays / 365;
		weeks = (ndays % 365)/7  ;
		days=(ndays % 365)%7;
	   
	    
	    System.out.println("Days of years : " +years);
       System.out.println("Days of  weeks : " +weeks);
       System.out.println("Days : " +days);
       
       sc.close();
	}

}
