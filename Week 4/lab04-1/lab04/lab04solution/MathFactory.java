/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04solution;

import robot.*;

/**
 * This class represents a factory for creating Math robots.
 * It extends the FactoryInterface class and implements the buildARobot and testYourRobot methods.
 */
public class MathFactory extends FactoryInterface {

    /**
     * Builds a new MathematicianRobot object with the given name.
     * @param name the name of the robot
     * @return a new MathematicianRobot object
     */
    public Robot buildARobot(String name){
        return new MathematicianRobot(name);
    }

    /**
     * Tests the given robot by calling its showExpertise method, if it is not null.
     * @param r the robot to test
     */
    public void testYourRobot(Robot r){
        if(r != null)
            r.showExpertise();
    }
}