package exam13400Unfug.Problem1;

public class Test {

    public static void main(String[] args) {
        // Create phone manufacturers
        PhoneManufacturer apple = new PhoneManufacturer("Apple");
        PhoneManufacturer samsung = new PhoneManufacturer("Samsung");

        // Create network service providers
        NetworkServiceProvider att = new NetworkServiceProvider("AT&T");
        NetworkServiceProvider tmobile = new NetworkServiceProvider("T-Mobile");

        // Add network service providers as observers to phone manufacturers
        apple.subscribe(att);
        samsung.subscribe(att);
        samsung.subscribe(tmobile);

        // Create phones
        Phone iphone12 = new Phone("iPhone 12", 799.99);
        Phone galaxyS21 = new Phone("Galaxy S21", 699.99);

        // Add phones to phone manufacturers
        apple.addPhone(iphone12);
        samsung.addPhone(galaxyS21);

        // Set latest models
        apple.setLatestModel(iphone12);
        samsung.setLatestModel(galaxyS21);
    }
}