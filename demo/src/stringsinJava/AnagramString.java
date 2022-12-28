package stringsinJava;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="world";
		String s2="dlrow";
		if(s1.length()==s2.length())
		{
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			
			int flag=1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("Not anagram");
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println("Anagram");
		}
		else
			System.out.println("Not anagram");

	}

}
