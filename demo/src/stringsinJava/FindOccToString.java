package stringsinJava;

public class FindOccToString {

	 
	  static int findOccurrences(String str, char search, int index)
	  {
	      if(index >= str.length())
	      return 0;
	      
	      int count=0;
	      
	      if(str.charAt(index) == search)
	      count++;
	      
	      return count + findOccurrences(str,search,index+1);
	  }
	  
	  public static void main(String args[])
	  {
	      
	  String input = "The quick brown foc jumps over the lazy dog";
	  char search = 'a'; // Character to search is 'a'.
	  char search1= 'b';
	  char search2= 'c';
	  int result = findOccurrences(input,search,0); 
	  int result1 = findOccurrences(input,search1,0);
	  int result2 = findOccurrences(input,search2,0);
	  System.out.println(search+" = "+result);
	  System.out.println(search1+" = "+ result1);
	  System.out.println(search2+" = "+ result2);
	  }
	}

