/**
 * @author fahmidahamid
 * @author boland unfug
 * @date Sep 21 2020
 * @version 1.1
 */

package csci3400lab03;

public class FieldObserver implements Observer{
    
        private String name;
        private String propertyName;
        
        public FieldObserver(String name, String propertyName)
        {
            this.name = name;
            this.propertyName = propertyName;
        }

        @Override
        public void handle(PropertyChangedEvent args) {
            if (args.propertyName.contains(this.propertyName)){
                System.out.println("Field Observer " + this.name + " has been notified of the change in " + args.propertyName + " to " + args.newValue);
            }
        }
}