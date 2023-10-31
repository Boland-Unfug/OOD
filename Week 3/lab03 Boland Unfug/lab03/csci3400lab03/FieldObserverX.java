/**
 * @author fahmidahamid
 * @author boland unfug
 * @date Sep 21 2020
 * @version 1.1
 */

package csci3400lab03;

public class FieldObserverX extends FieldObserver {

    private String name;
    private String propertyName;
    private String threshold;

    //constructor
    public FieldObserverX(String name, String propertyName, String threshold) {
        super(name, propertyName);
        this.name = name;
        this.propertyName = propertyName;
        this.threshold = threshold;
    }

    @Override
    public void handle(PropertyChangedEvent args) {
        if (args.propertyName.contains(this.propertyName)) {
            // System.out.println("Old value: " + args.newValue + " Threshold: " + this.threshold);
            if (args.newValue.toString().contains(this.threshold)) {
                System.out.println("Field Observer " + this.name + " has been notified of the change in "
                        + args.propertyName + " to " + args.newValue);
            }
        }
    }
}