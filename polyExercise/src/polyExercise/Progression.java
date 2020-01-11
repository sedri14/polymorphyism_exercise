package polyExercise;

public abstract class Progression 
{
	Progression(int first_elem, int jump_value)
	{
		this.first_elem = first_elem;
		this.jump_value = jump_value;
	}
	
	protected int first_elem;
	protected int jump_value;
	
	public abstract double getElement(int n);
	
	public abstract double getSum(int n);

	public int getFirst_elem() {
		return first_elem;
	}

	public void setFirst_elem(int first_elem) {
		this.first_elem = first_elem;
	}

	public int getJump_value() {
		return jump_value;
	}

	public void setJump_value(int jump_value) {
		this.jump_value = jump_value;
	}

	@Override
	public String toString() {
		return "Progression [first_elem=" + first_elem + ", jump_value=" + jump_value + "]";
	}
	
	
	
}
