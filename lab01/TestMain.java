import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Comparator;
/**
 * @author Boland Unfug
 * @date Aug 25 2021
 * @version 1.1
 * citations: java docs, stack overflow
 * https://stackoverflow.com/questions/36806569/how-do-you-sort-a-collection-of-a-custom-object-by-a-field-which-is-itself-an-ob
 */

public class TestMain {

	/**
	 * 
 	*
 	* This method reads from a file called robotList.txt and creates an ArrayList of Robots.
	 * It also sorts the ArrayList of Robots by their ranks and prints the list.
 	*/

	public static void main(String[] args) throws IOException{
		
	      Robot testRobot = new Robot();
	      System.out.println(testRobot);

		  // create an array of Robot objects from a file

		  ArrayList<Robot> robotList = new ArrayList<Robot>();
		  robotList = TestMain.createRobotListFromFile("robotList.txt");
		  // print the array of Robot objects
		  System.out.println(robotList);
		  // sort the array of Robot objects by rank
		  robotList.sort(Comparator.comparing(Robot::getRank));
		  // print the array of Robot objects
		  System.out.println(robotList);
		  // sort the array of Robot objects by name, in alphabetical order
		  robotList.sort(Comparator.comparing(Robot::getName));
		  // print the array of Robot objects
		  System.out.println(robotList);
	}		

	/**
	 * 
	 * @param string
	 * @return robotList
	 * @throws FileNotFoundException
	 * 
	 * This method reads from a file called robotList.txt and creates an ArrayList of Robots.
	 */
	public static ArrayList<Robot> createRobotListFromFile(String string) {
		File file = new File(string);
		ArrayList<Robot> robotList = new ArrayList<Robot>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] robotInfo = line.split(" ");
				Robot robot = new Robot(robotInfo);
				robotList.add(robot);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return robotList;
	}
}
