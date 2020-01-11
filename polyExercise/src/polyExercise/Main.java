package polyExercise;

public class Main 
{

	public static void main(String[] args) 
	{
		ArithmeticProgression ap1 = new ArithmeticProgression(1,1);
		
		for(int i=1; i <= 10; i++)
		{
			System.out.println("Element number " + i + " of arithmetic progression with first element: "
					+ ap1.getFirst_elem() + " and d: " + ap1.getJump_value() + " is: " + ap1.getElement(i));			
		}
		
		GeometricProgression gp1 = new GeometricProgression(1,2);
		
		for(int i=1; i <= 10; i++)
		{
			System.out.println("Element number " + i + " of geometric progression with first element: "
					+ gp1.getFirst_elem() + " and q: " + gp1.getJump_value() + " is: " + gp1.getElement(i));			
		}


	}

}
