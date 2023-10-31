/**
 * @author fahmidahamid
 * @author boland unfug
 * @date Sep 21 2020
 * @version 1.1
 */

package csci3400lab03;

public class WeatherObserver implements Observer{
    
        private String name;
        
        public WeatherObserver(String name)
        {
            this.name = name;
        }
        
        @Override
        public void handle(PropertyChangedEvent args) {
            
            System.out.println("Weather Observer " + this.name + " has been notified of the change in " + args.propertyName + " to " + args.newValue);
        }



}