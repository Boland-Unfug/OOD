package templatemethodpattern;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OddCounter extends StringProcessor // FindOdd is-A StringProcessor
{
	@Override
	public String process(String t) {
		
		String[] words = t.split(" ");
		List<String> oddLengthWords = new ArrayList<String>();
		
		for(String w: words)
		{
			if(w.length() % 2 == 1)
			{
				oddLengthWords.add(w);
			}
		}
	
		String sample = "The odd length words are: \n";
		for(String w: oddLengthWords)
		{
			sample += w + ", ";
			
		}
		sample += "\n";
		
	  return sample;
		
	}
	
	@Override
	public void write(String text)
	{
		try{
			  FileWriter writer = new FileWriter("./output.txt");
		      writer.write(text);
		      writer.close();
		      System.out.println("The corresponding output is written in the specified file.");
		      
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
}
