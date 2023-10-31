package strategypattern;

import java.util.Scanner;

public class DemoStrategyPattern {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//test 1
		MysteriousTextProcessor mst = new MysteriousTextProcessor(new WordCounter());
		mst.runAlgo(sc);
		mst.resetAlgo(new LongestWordFinder());
		mst.runAlgo(sc);
		
		mst.resetAlgo(new OddFinder());
		mst.runAlgo(sc);
		/*
		//test 2
	    MysteriousTextProcessor mst2 = new MysteriousTextProcessor(new FindLongestStrategy());
	    mst2.runAlgo(sc);
		
	  //test 3
	    MysteriousTextProcessor mst3 = new MysteriousTextProcessor(new FindOddStrategy());
	    mst3.runAlgo(sc);
		*/
		
		sc.close();
	}
	
}
