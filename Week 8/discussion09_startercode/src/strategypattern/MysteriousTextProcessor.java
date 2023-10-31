package strategypattern;

import java.util.Scanner;

public class MysteriousTextProcessor<T extends StringProcessorInterface>
{
	private T myStringProcessor; 
	//composition, MysteriousTextProcessor has-A StringProcessorInterface
	
	public MysteriousTextProcessor(T strx)
	{
		myStringProcessor = strx;
	}

	public void runAlgo(Scanner s)
	{
		System.out.println("I am " + this.getClass().getSimpleName());
		System.out.println("I am working with " + myStringProcessor.getClass().getSimpleName() + " class...");
		System.out.println("\nPlease provide some input: ");
		myStringProcessor.run(s);
		System.out.println("Mysterious Process ends :)\n");
		
	}

	public void resetAlgo(T strx)
	{
		myStringProcessor = strx;
	}
	
}
