package polyExercise;

public class ArithmeticProgression extends Progression 
{
	ArithmeticProgression(int first_elem, int jump_value)
	{
		super(first_elem, jump_value);
	}
	
	@Override
	public double getElement(int n) 
	{
		return first_elem + (n-1)*jump_value; 
	}
	
	@Override
	public double getSum(int n) 
	{
		return (n*(first_elem + getElement(n)) ) /2;
	}
}
