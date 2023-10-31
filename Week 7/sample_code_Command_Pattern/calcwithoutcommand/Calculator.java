package calcwithoutcommand;
/**
 * 
 * @author fahmidahamid
 * This class has several functionalities to mimic to behavior of a simple calculator
 * @param Double
 */

/*
 * Receiver
 */

public class Calculator{

	private Double initialValue;
	
	public Calculator(Double initialValue){
		this.initialValue = initialValue;
	}
	
	public void add(Double newValue)
	{
		this.initialValue = this.initialValue + newValue;;
		
	}
	
	public void subtract(Double newValue)
	{
		this.initialValue = this.initialValue - newValue;
		
	}
	
	public void multiply(Double newValue)
	{
		this.initialValue = this.initialValue * newValue;
		
		
	}
	public void divide(Double newValue)
	{
		if(newValue != 0.00)
			this.initialValue = this.initialValue / newValue;
		else
			this.initialValue = Double.NaN;
	}
	
	public void resetToZero()
	{
		initialValue = 0.00;
		
	}
	
	public void setToNewValue(Double newValue)
	{
		initialValue = newValue;
		System.out.println("Current Value: " + toString());
	}
	public Double getValue()
	{
		return initialValue;
	}
	public String toString() {
		return "The current value is: " + Double.toString(initialValue);
	}
}


