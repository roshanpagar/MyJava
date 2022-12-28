package stringsinJava;
import java.util.Arrays;

public class ArrayString {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//             012   01234   0123
			String str[]={"Raj","Aadya","Veer","Rahul","Anjali","Ajay","Leena","Reena"};
			
			for(int i=0;i<str.length;i++)
			{
				char ch[]=str[i].toCharArray();
				//starts with
				/*if(ch[0]=='R')
				{
					String s=new String(ch);
					System.out.println(s);
				}*/
				
				//ends with
				/*if(ch[ch.length-1]=='a')
				{
					String s=new String(ch);
					System.out.println(s);
				}*/
				
				//conatins j
				for(int j=0;j<ch.length;j++)
				{
					if(ch[j]=='j')
					{
						String s=new String(ch);
						System.out.println(s);
						break;
					}
						
				}
					
					
			}
			
		/*	for(int i=0;i<str.length;i++)
			{
				//System.out.println(str[i]+" = "+str[i].length());
				
				if(str[i].startsWith("R"))
					System.out.println(str[i]);
				
				if(str[i].contains("ee"))
					System.out.println(str[i]);
				
			}
			
			//Arrays.sort(str);
			
			System.out.println(Arrays.toString(str));
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<str.length-1;j++)
				{
					if(str[j].compareTo(str[j+1])<0)
					{
						String t=str[j];
						str[j]=str[j+1];
						str[j+1]=t;
					}
				}
			}
			System.out.println(Arrays.toString(str));
			*/
			

		}

	}

