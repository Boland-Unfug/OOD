/**
 * @author fahmidahamid
 * @author Boland Unfug
 * @date September 21 2023
 * @version 1.1
 */

package lab04solution;

import robot.*;

/**
 * This class tests the implementation of different factories by creating robots and testing the robots.
 * It creates an array of three factories, named MathFactory, NLPFactory, and NurseFactory, and uses them to build robots.
 * It then tests each robot using the corresponding factory's testYourRobot method.
 */
public class SolutionTesting {
    public static void main(String[] args){
        FactoryInterface[] factories = new FactoryInterface[3];
        factories[0] = new MathFactory();
        factories[1] = new NLPFactory();
        factories[2] = new NurseFactory();
        
        for(int i = 0; i < factories.length; i++){
            Robot r = factories[i].buildARobot("Robot " + i);
            factories[i].testYourRobot(r);
        }
    }
}