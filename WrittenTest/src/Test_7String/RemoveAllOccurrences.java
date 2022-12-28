package Test_7String;
/*4.Remove all the occurrences of the word in the given string
(without using replace function)*/
public class RemoveAllOccurrences {
    public static void main(String args[]) {

	String s="Java language.core java sessions.advance java";
	String str[]=s.split(" ");
	System.out.println(s);
	
	String str1[]=new String[str.length];
	int j=0;
	String s1="";
	
	for(int i=0;i<str.length;i++)
	{
		if(!str[i].equalsIgnoreCase("java"))
		{
			s1=s1+str[i];
		}
	}
	System.out.println(s1+" ");

			
}

}
	

