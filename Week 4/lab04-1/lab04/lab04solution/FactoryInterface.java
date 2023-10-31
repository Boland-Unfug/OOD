/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04solution;

import robot.*;

/**
 * This abstract class represents a factory interface for building and testing robots.
 */
abstract class FactoryInterface {
    
    /**
     * Builds a robot with the given name.
     * 
     * @param name the name of the robot to be built
     * @return the newly built robot
     */
    public abstract Robot buildARobot(String name);
    
    /**
     * Tests the given robot.
     * 
     * @param r the robot to be tested
     * @return the robot's expertise
     */
    public abstract void testYourRobot(Robot r);
}