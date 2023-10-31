package robot;

import java.util.HashMap;
import java.util.Scanner;

public class NLPResearcher extends Robot{

	public NLPResearcher(String name) {
		super(name);
	}

	@Override
	public void showExpertise() {
		System.out.println(this);
		System.out.println("Thank you for creating me! I am an expert NLP researcher. "
				+ "I can count the frequency of every character in a given string. Here is an example ...");
		
		HashMap<Character, Integer> data = countFrequency();
		
		data.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		});

		
	}

	private HashMap<Character, Integer> countFrequency()
	{
		
	    String rawInput = this.readData();
	    HashMap<Character, Integer> frequency= new HashMap<Character, Integer>();
	    
	    for(int i = 0; i < rawInput.length(); i++)
	    	if (frequency.containsKey(rawInput.charAt(i)))
	    			frequency.put(rawInput.charAt(i), frequency.get(rawInput.charAt(i)) + 1);
	    	else
	    		frequency.put(rawInput.charAt(i), 1);
	    			
		
		return frequency;
		
		
	}
	
	private String readData()
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a string");

	    String rawInput = myObj.nextLine();  // Read user input
		// I was getting a resource leak, so I have to close the scanner
		myObj.close();

	    return rawInput;
		
	}
	
	
	@Override
	public String toString() {
		return 
				"I am "+ super.getName() + 
					" and I am an researcher of Natural Language Processing.";
	}

	
	
}
