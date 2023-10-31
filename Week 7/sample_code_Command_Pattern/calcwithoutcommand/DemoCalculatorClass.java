package calcwithoutcommand;

public class DemoCalculatorClass {

	public static void main(String[] args)
	{
		Calculator c = new Calculator(23.5);
		c.add(2222.0);
		
		System.out.println("After adding: " + c.getValue());
		
		c.subtract(15.99);
		System.out.println("After subtracting: " + c.getValue());
		
		/*
		 * 
		 * a) As a client, I need to know of the methods (the names, parameters, etc.) in order to
		 * be able to invoke them. This seems inconvenient. Can someone else take care of it?
		 * 
		 * --> An invoker who might be more familiar with the system than the client/third party!
		 * 
		 * b) How do I undo some of the operations to get the initial value back? 
		 * 
		 * 
		 */
		
	}
	
}
