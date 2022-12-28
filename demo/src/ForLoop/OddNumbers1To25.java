package ForLoop;

public class OddNumbers1To25 {
	
	public static void msin(String[] args)
	{
	
		int count=0;
	
	for(int i=1; i<=25; i++)
	{
		if(i%2!=0) 
			count++;
		}
	System.out.println(count);
	
	}
}
