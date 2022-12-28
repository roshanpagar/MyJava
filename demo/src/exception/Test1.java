package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args){
		
		try
		{
		// TODO Auto-generated method stub
		
		FileInputStream fis =new FileInputStream("D:\\session.txt");
		
		int i;
		while((i=fis.read())!=1)
		{
			System.out.println((char)i);
		}
		System.out.println();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}

}