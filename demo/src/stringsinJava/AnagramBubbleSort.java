package stringsinJava;
import java.util.Arrays;
public class AnagramBubbleSort {
	

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
					
					
					//int arr[]= {10,50,30,20,40,60,9,8};
					char arr[]= {'z','d','p','e','s','x','b','g','a'};
					System.out.println(Arrays.toString(arr));
					
					for (int i=0;i<arr.length;i++)
					{
						for(int j=0;j<arr.length-1;j++)
						{
							if(arr[j]>arr[j+1]) 
							{
							 //  int temp=arr[j]; // integer Array
							 char temp=arr[j];  // charectorArray
							   arr[j]=arr[j+1];
							   arr[j+1]=temp;
							}
						}
					}
					System.out.println(Arrays.toString(arr));
					
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

}
