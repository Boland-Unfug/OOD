package strategypattern;

public class LongestWordFinder implements StringProcessorInterface
{
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
