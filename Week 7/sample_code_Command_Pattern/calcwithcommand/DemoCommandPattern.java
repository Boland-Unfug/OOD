package calcwithcommand;

import calcwithoutcommand.Calculator;


/*
 * 2 cases for the command pattern:
 * Online shopping, with commands like addtocart and pay are helpful commands. The reversable nature, like removing something from your cart, is one useful feature of the pattern.
 * Airplane and airline systems would be a great case for the command pattern, as user input has to be translated to commands for mechanical systems.
 * 
 * Drawbacks:
 * The quantity and nature of commands is really important. Too few, and its better left to a simpler system. Too many, and the system becomes bloated, like the decorator pattern.
 */
public class DemoCommandPattern {

	public static void main(String[] args) {

		// we are creating a calculator object.
		Calculator cX = new Calculator(10.5);
		System.out.println(cX);

		// we want to pass some commands to the calculator. So we are creating three
		// different command objects.

		Command a = new AddCommand(cX, 10.0);
		Command b = new SubCommand(cX, 110.9);
		Command c = new MultCommand(cX, -10.0);

		// Step 01> uncomment the following instructions and observe the outcome.
		// a.execute();
		// b.execute();
		// c.execute();

		/*
		 * Step 02> uncomment the following four instructions and observe the
		 * outcome.
		 * 
		 *
		 * 
		 * 
		 */
		Command d = new DivCommand(cX, 2.0);
		// d.execute();

		// Step 03>> Now uncomment the following four lines and note the differences
		/*
		 */
		// d.undo();
		// c.undo();
		// b.undo();
		// a.undo();

		/*
		 * Step 04
		 * Issue: Can we have an invoker who will take
		 * care of all of our commands? - Yes, if we have a list of commands.
		 * 
		 * uncomment the following lines and note the differences. While testing this
		 * part
		 * you may want to comment out all previous calls of execute() and undo()
		 */

		CommandInvoker cvk = new CommandInvoker();

		cvk.addCommand(a);
		cvk.addCommand(b);
		cvk.addCommand(c);
		cvk.addCommand(d);

		System.out.println("Before adding: " + cX.getValue());

		cvk.executeCommand();

		System.out.println("\t After completing the executions: " + cX.getValue());

		cvk.undoCommand();

		System.out.println("\t\tAfter undoing all the executions: " + cX.getValue());
	}

}