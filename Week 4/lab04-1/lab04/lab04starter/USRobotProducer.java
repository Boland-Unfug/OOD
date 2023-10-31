/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04starter;

import robot.*;

public class USRobotProducer{

	public Robot buildARobot(String name, String type) {
		
		if (type.equalsIgnoreCase("mat"))
			return new MathematicianRobot(name);
		else if (type.equalsIgnoreCase("nlp"))
			return new NLPResearcher(name);
		else if (type.equalsIgnoreCase("nrs"))
			return new NurseRobot(name);
		else
		{
			System.out.println("The factory does not have permission to produce what you may be expecting");
			return null;
		}
	}
	
	public void testYourRobot(Robot r)
	{
		if(r != null)
			r.showExpertise();
			
	}
	
	
}
