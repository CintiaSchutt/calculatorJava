package ca.bcit.comp2526.A01030606;

/**
 * 
 * @author cintia schutt
 *
 */

public class MultiplicationOperation implements Operation 
{
	@Override
	public double perform(double operandA, double operandB) 
	{		
		return operandA * operandB;
	}
}
