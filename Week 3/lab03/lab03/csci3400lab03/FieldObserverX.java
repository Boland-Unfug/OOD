package csci3400lab03;

public class FieldObserverX extends FieldObserver{
        
            private String name;
            private String propertyName;
            private String threshold;
            
            public FieldObserverX(String name, String propertyName, String threshold)
            {
                this.name = name;
                this.propertyName = propertyName;
                this.threshold = threshold;
            }
            
            @Override
            public void handle(PropertyChangedEvent args) {
                if (args.propertyName.contains(this.propertyName)){
                    if (args.threshold.contains(this.threshold)){
                        System.out.println("Field Observer " + this.name + " has been notified of the change in " + args.propertyName + " to " + args.newValue);
                    }
                    System.out.println("Field Observer " + this.name + " has been notified of the change in " + args.propertyName + " to " + args.newValue);
                }
            }
}
