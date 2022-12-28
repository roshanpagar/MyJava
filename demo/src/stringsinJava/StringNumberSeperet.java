package stringsinJava;

public class StringNumberSeperet {

public static void main(String args[]) {  
  String a = "java4Core5Language6";  
  /*  int i;  
    String str1="";  
    String str2="";  
    int sum=0;
    for(i = 0; i < a.length(); i++){  
             char c = a.charAt(i);  
                if( '0' <= c && c <= '9' )  
                         str1=str1+c;  
                if( 'a' <= c && c <= 'z' )  
                         str2=str2+c;  
                
           sum=sum+((a.charAt(i)-48));
       }  
   System.out.println(str2);  
   System.out.println(str1);  
   System.out.println(sum);
   
   }*/
  char ch[]=a.toCharArray();
  int sum=0;
  for(int i=0;i<ch.length;i++)
  {
	  if(ch[i]>='0'&& ch[i]<='9')
	  {
		  sum=sum+(ch[i]-48);
	  }
  }
  System.out.println(sum);
}
}