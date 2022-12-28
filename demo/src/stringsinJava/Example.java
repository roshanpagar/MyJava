package stringsinJava;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="Java is a good programming language";
		
		String strg[]=st.split(" ");
		System.out.println(Arrays.toString(strg));
		
		for(int i=0;i<strg.length;i++)
		{
			char ch[]=strg[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		
		
	}

}
