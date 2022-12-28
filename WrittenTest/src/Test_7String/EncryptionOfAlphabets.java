package Test_7String;
/*3.The encryption of alphabets are to be done as follows:	[2]
A=1,B=2,C=3,Z=26
The potential of a word is found by adding the encrypted value of the alphabets.

Example: KITE
Potential = 11 + 9 + 20 + 5 = 45
Accept a sentence Decode the words according to their potential 

Output the result in format given below:
 Input:THE SKY IS THE LIMIT.

OUTPUT:THE=33,SKY=55,IS=28,THE=33,LIMIT=63 */

import java.util.*;
public class EncryptionOfAlphabets {
	public static void main(String args[]) {
				
		String s="KITE";
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{		
			int j=ch[i]-64;
			sum=sum+(ch[i]-64);
		System.out.println(ch[i]+":"+j);
		}
		System.out.println(sum);		
		
		
		String k="THE SKY IS THE LIMIT";
		String s1[]=k.split(" ");
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++)
		{
		int sum1=0;
			 char ch1[]=s1[i].toCharArray();	
			 for(int j=0;j<ch1.length;j++) {
				 sum1=sum1+(ch1[j]-64);
			 }
			 System.out.println(s1[i]+":"+sum1);
		}
		
		
	}


}


