package stringsinJava;

import java.util.Arrays;

public class removeOccBCAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbcaabbcaab";
		//String s1="";
	    char ch[]=s.toCharArray();
	    
	    System.out.println(Arrays.toString(ch));
	    String s1="";
	    int len=ch.length;
	    
	    for(int i=0;i<len;i++)
	    {
	    	if(i==len-1 || i==len-2)
	    	{
	    		s1=s1+ch[i];
	    	}
	    	else
	    	{
	    		if(ch[i]=='b'&& ch[i+1]=='c' && ch[i+2]=='a')
	    		{
	    			i=i+2;
	    		}
	    		else
	    		{
	    			s1=s1+ch[i];
	    		}
	    	}
	    }
			System.out.println(s1);
	}

}
