package lab04starter;

import robot.*;

public class ChineseRobotIndustry{
	//Write the `ChineseRobotIndustry` class with expected methods (`deliver` and `test`) in it

    public Robot deliver(String name){
            return new MathematicianRobot(name);
    }

    public void test(Robot r){
        if(r != null)
            r.showExpertise();
    }
}
