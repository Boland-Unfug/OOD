package csci3400lab03;

public class WeatherObserver implements Observer{
    
        private String name;

        private Weather weather;
        
        public WeatherObserver(String name, Weather weather)
        {
            this.name = name;
            this.weather = weather;
        }
        
        @Override
        public void handle(PropertyChangedEvent args) {
            
            System.out.println("Weather Observer " + this.name + " has been notified of the change in " + args.propertyName + " to " + args.newValue);
        }



}