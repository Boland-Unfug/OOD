package templatemethodpattern;

public class WordCounter extends StringProcessor // WordCounter is-A StringProcessor
{
	/**
	 * process: This method takes a string as input and returns a string 
	 * that tells us the number of words in the given string
	 */
	@Override
	public String process(String t) {
		
		int words = t.split(" ").length;
		return "The string: \'" + t + "\' has " + words + " words in it.";
	}
	
}

