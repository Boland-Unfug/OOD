package templatemethodpattern;

public class LongestWordFinder extends StringProcessor // FindLongest is-A StringProcessor
{
	/**
	 * process: This method takes a string as input and returns a string 
	 * that tells us the number of words in the given string
	 */
	@Override
	public String process(String t) {
		
		String[] words = t.split(" ");
		String longestWord = null;
		int longestLength = 0;
		for(String w: words)
		{
			if(w.length() >= longestLength)
			{
				longestWord = w;
				longestLength = w.length();
			}
		}
		return "The longest word in the text is: " + longestWord;
	}
	
}

