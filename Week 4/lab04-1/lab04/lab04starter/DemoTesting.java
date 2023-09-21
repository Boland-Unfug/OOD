package lab04starter;
import robot.*;

public class DemoTesting {

	public static void main(String[] args) {
		ChineseRobotIndustry cri = new ChineseRobotIndustry();
		Robot r = cri.deliver("R2D2");
		cri.test(r);
		
		
		
	}
	
}
