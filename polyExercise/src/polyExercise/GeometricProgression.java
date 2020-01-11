package polyExercise;
import java.lang.Math;

public class GeometricProgression extends Progression
{
	GeometricProgression(int first_elem, int jump_value)
	{
		super(first_elem, jump_value);
	}
	
	@Override
	public double getElement(int n) 
	{
		return  first_elem*(Math.pow(jump_value, n-1));
	}
	
	@Override
	public double getSum(int n) 
	{
		return (first_elem*(Math.pow(jump_value, n) -1)) / (jump_value-1);
	}

}
