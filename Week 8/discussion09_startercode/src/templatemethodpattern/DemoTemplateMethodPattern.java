package templatemethodpattern;

import java.util.Scanner;

/**
 * 
 * In this example we implement the idea of template method pattern.
 * 
 * @author fahmidahamid
 * @version 1.2
 * @since Oct 29, 2023
 * 
 */

 /*
  * Question 01: Which method is the template method in this example? [3 points]

The template method is StringProcessor, or in the code StringProcessorInterface.


Question 02: What is the common behavior among all the subclasses of the StringProcessor class?

All subclasses take a string, read it, process it to get a substring, and write an output substring to some location.


Question 03: What is the relationship between the MysteriousTextProcessor and the StringProcessorInterface? (inheritance or composition) [3 points]

Composition.


Question 04: If we have a MysteriousTextProcessor, which (or what type of) algorithm can be run via the "runAlgo(...)" method? [3 points]

RunAlgo takes in a scanner (text input) and we can run any of the string processing classes.


Question 05: What is your takeaway message about the Strategy pattern? Explain your answer via the example of the given code. [3 points]

It is really useful for situations where there is a wide variety of interactions with a few types of input or output.


Question 06: Add one more strategy class that implements the StringProcessorInterface. You may design a class that takes a string, finds the longest palindrome from the string, and returns/prints the longest palindrome from the user input. [10 points]

Question 07: Test the new Strategy (run the Demo --> main).  Copy and paste the sample output. [3 points]
The corresponding output is written in the specified file.
Please enter some string:
this word has racecar in it!
The longest palindrome in the text is: racecar

  */

public class DemoTemplateMethodPattern {

	public static void main(String[] args) {
		
		 System.out.println("We are about to test three different types of string processors.\n");
		 
		 Scanner scr = new Scanner(System.in);
		 
		 WordCounter wc = new WordCounter();
		 wc.run(scr);

		 LongestWordFinder lwf = new LongestWordFinder();
		 lwf.run(scr);
		
		 OddCounter oc = new OddCounter();
		 oc.run(scr);

		 LongestPalindromFinder lpf = new LongestPalindromFinder();
		 lpf.run(scr);

		 scr.close();
	}

}
