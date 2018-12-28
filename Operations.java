package ca.bcit.comp2526.A01030606;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.*;

/**
 * 
 * @author cintia schutt
 *
 */

public final class Operations 
{	
	private static final Map<String, Class <? extends Operation>> operations;		
	
	//initialization block
	static 
	{
		operations = new HashMap<String, Class<? extends Operation>>();
		new Operations();
	}
	
	//constructor
	private Operations() 
	{
		operations.put("+", AdditionOperation.class);
		operations.put("-", SubtractionOperation.class);
		operations.put("*", MultiplicationOperation.class);
		operations.put("/", DivisionOperation.class);
		operations.put("%", ModulationOperation.class);
		operations.put("^", ExponentiationOperation.class);		
	}		
	
	
	public static Operation getOperationFor(final String symbol) 
			throws InstantiationException, 
			IllegalAccessException,
			BadOperationException
	{		
		Operation op;		
		
		if(operations.get(symbol) != null) 
		{
			
			Class<? extends Operation> operationClass = getOperationClassFor(symbol);
			op =  operationClass.newInstance();				
		} else
		{			
			throw new BadOperationException(symbol);			
		}					
		
		return op;
	}
	
	public static Class<? extends Operation> getOperationClassFor(final String input) 			
	{		
		return operations.get(input);				
	}		

}
