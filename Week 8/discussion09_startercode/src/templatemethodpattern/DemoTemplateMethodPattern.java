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
		 
		 scr.close();
		
	}

}
