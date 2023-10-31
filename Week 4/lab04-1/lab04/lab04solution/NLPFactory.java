/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04solution;

import robot.*;

/**
 * This class represents a factory for creating NLPResearcher robots.
 * It extends the FactoryInterface class and implements the buildARobot and testYourRobot methods.
 */
public class NLPFactory extends FactoryInterface {

    /**
     * Builds a NLPResearcher robot with the given name.
     * @param name the name of the NLPResearcher robot to be built.
     * @return the NLPResearcher robot object that was built.
     */
    public Robot buildARobot(String name){
        return new NLPResearcher(name);
    }

    /**
     * Tests the given Robot object and shows its expertise if it is not null.
     * @param r the Robot object to be tested.
     */
    public void testYourRobot(Robot r){
        if(r != null)
            r.showExpertise();
    }
    
}
