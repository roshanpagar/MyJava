
//package Pattern;
//
//public class PatternA {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for(char ch='a';ch<='e';ch++)
//			
//		{
//			for(char ch1='a';ch1<=ch;ch1++)
//			{
//				System.out.print(ch1+" ");
//			}
//			System.out.println();
//		}
//
//	}
//
//}
package Pattern;

public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=5;i++)
		{
			char ch='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}


	}

}