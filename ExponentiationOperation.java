package ca.bcit.comp2526.A01030606;

/**
 * 
 * @author cintia schutt
 *
 */

public class ExponentiationOperation implements Operation 
{	
	@Override
	public double perform(double operandA, double operandB) 
	{
		if(operandB == 0) {
			return 1;
		} else if( operandB == 1) {
			return operandA;
		} else {
			return operandA * perform(operandA, operandB - 1);
		}		
	}
}
