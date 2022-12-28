package Test_2Loops;
//Q.5- Find all prime number between 400 to 300;
public class FindPrimeNumbers {
	public static void main(String[] args) 
	{
		System.out.println("Prime numbers from 400 to 300 are :");
			for (int i = 400; i >= 300; i--)
				{
				int count = 0;
				for (int j = i; j >= 1; j--)
				{
			if (i % j == 0)
				{
				count++;
				}
			}
			if (count == 2)
		{
		      System.out.print(i + " ");
    }
   }
  }
}