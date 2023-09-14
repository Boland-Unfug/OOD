package students.task01;

/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date Aug 31 2020
 * @version 1.1
 */

// Composition and Delegation



public class TestMain {

	
	public static void main(String[] args) {
		

		String testString = "new strings look interesting with just 53 characters.";
		FunString fn = new FunString(testString);
		System.out.println(fn);
		System.out.println(fn.length());
		
		
	}

}