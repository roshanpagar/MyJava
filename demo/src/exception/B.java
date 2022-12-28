package exception;
import java.io.FilleNotFoundexception;
import javax.imageio.IIOException;
import java.sql.SQLException;

public class B {
	class A
	{
		void add() throws IIOException
		{
			
		}
	}

	public class B extends A
	{
		void add() throws SQLException
		{
			
		}
	}
	
	// parent -- child
	
	// No Exception -- noException,Runtime Exception
	// No Exception-- Compile time not Allowed
	//Runtime exception--no exception, same Runtime, Different runtime
	// runtime -- compile time not allowed
	
	//Compile time -- No exception , same exception, Runtime Allowed, Child class of parent exception
	//Complie time -- Different compile time not allowed
}
