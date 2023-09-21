package lab04starter;

import robot.*;

public class USRobotProducer{

	public Robot buildARobot(String name, String type) {
		
		if (type.equalsIgnoreCase("mat"))
			return new MathematicianRobot(name);
		else if (type.equalsIgnoreCase("nlp"))
			return new NLPResearcher(name);
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
