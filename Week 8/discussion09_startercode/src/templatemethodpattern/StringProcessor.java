package templatemethodpattern;

import java.util.Scanner;

/**
 * 
 * StringProcessor: An abstract class that 
 * simulates the behavior of a very simple text editor.
 *
 */
public abstract class StringProcessor
{
	
	/**
	 * read() reads some text from console
	 * @return returns a String
	 */
	
	public String read(Scanner scr) {
		
		
		System.out.println("Please enter some string: ");
		String text = scr.nextLine();
		return text;
		
	}	
	
	/**
	 * write(String text) writes the text to console.
	 * @param text, A string
	 */
	
	public void write(String text) {
		
		
		System.out.println(text);
		
	}
	
	/**
	 * processes the text input t
	 * @param t, a string
	 * @return another string
	 */
	public abstract String process(String t);
	
	
	/**
	 * The algorithm implemented in the run() method is the following:
	 * 1. Read Input as Text
	 * 2. Process the text (The algorithm/rules to process the text can be different)
	 * 3. Write the processed text into a default "output.txt" file.
	 * 
	 */
	public void run(Scanner scr)
	{
		String text = read(scr);
		String processedText = process(text);
		write(processedText);	
	}

	
	
	
}



