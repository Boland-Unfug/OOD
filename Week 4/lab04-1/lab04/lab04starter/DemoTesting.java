/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04starter;
import robot.*;

public class DemoTesting {

	public static void main(String[] args) {
		//Test ChineseRobotIndustry
		ChineseRobotIndustry cri = new ChineseRobotIndustry();
		Robot r = cri.deliver("R2D2");
		cri.test(r);

		//Test USRobotProducer with a MathematicianRobot
		USRobotProducer usrp = new USRobotProducer();
		Robot r2 = usrp.buildARobot("C3PO", "MAT");
		usrp.testYourRobot(r2);

		//Test USRobotProducer with a NLPResearcher
		Robot r3 = usrp.buildARobot("BB8", "NLP");
		usrp.testYourRobot(r3);

		//Test USRobotProducer with a NurseRobot
		// who is the robot in big hero 6?
		Robot r4 = usrp.buildARobot("Baymax", "NRS");
		usrp.testYourRobot(r4);




		
		
		
	}
	
}
