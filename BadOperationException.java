package ca.bcit.comp2526.A01030606;

/**
 * 
 * @author cintia schutt
 *
 */

public class BadOperationException extends Exception 
{	
	private String input;	
	
	public BadOperationException (final String msg) 
	{
		input = msg;
	}

	public String getName() 
	{			
		return input;
	}
	
	public String getMessage() 
	{		
		return "Bad Operation: " + input;
	}
}
