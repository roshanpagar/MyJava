package Test_7String;

import java.util.Arrays;

//1.WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitStringTwoTokens {
	public static void main(String[] args) {
		String s1="HELLO@WORLD";
		
		String str[]=s1.split("@");
		
		System.out.println(Arrays.toString(str));
		
		for(int i=0;i<str.length;i++)
		{/*
			//char ch[]=str[i].toCharArray();
			//for(int j=str[i].length()-1;j>=0;j--)
			{*/
			
				System.out.print(str[i]);
			}
			}
		}
	


