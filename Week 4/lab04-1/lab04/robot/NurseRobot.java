/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package robot;


public class NurseRobot extends Robot{

	public NurseRobot(String name) {
		super(name);
	}

	@Override
	public void showExpertise() {
		System.out.println(this);
		System.out.println("Thank you for creating me! I can help you with your health. "
				+ "I hope I can be of service!");
	}
	
	@Override
	public String toString() {
		return 
				"I am "+ super.getName() + 
					" and I am a Nurse.";
	}


	
	
}

