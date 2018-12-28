package ca.bcit.comp2526.A01030606;


public class Main
{
    public static void main(final String[] argv)        
    {
    	final Operation operation;  
    	
    	try {   		          
            operation = Operations.getOperationFor(argv[1]);
            
            System.out.println(operation.perform(Double.parseDouble(argv[0]), 
                                                 Double.parseDouble(argv[2])));
            
                        
    	} catch (InstantiationException e) {
    		System.err.println("Cannot create instance of " + e.getLocalizedMessage());
    		
    	} catch (IllegalAccessException e) {
    		System.err.println("Cannot access " + e.getLocalizedMessage());
        	
        } catch (BadOperationException e) {		
        	
        	System.err.println(e.getMessage());
		}
    } 
}
