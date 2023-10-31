/*
Assume we have two classes: PhoneManufacturer and NetworkServiceProvider, who would act like 
real-life phone manufacturers (Apple, Samsung, etc.) and network providers (AT&T, T-Mobile, 
Verizon, etc.): 
  
• Each network provider has an interest in different manufacturers.  
• The providers want a notice whenever a manufacturer releases a new phone model.  
• Whenever the provider receives a notification, they release a message for their clients.
 */


package exam13400Unfug.Problem1;

import java.util.List;
import java.util.ArrayList;


/**
 * This class represents a phone, storing its name and price.
 */
class Phone {
	private String name;
	private Double price;

	public Phone(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

/**
 * This class represents a phone manufacturer that produces phones and notifies its observers when a new phone model is released.
 */
class PhoneManufacturer extends Observable {
	private String name;
	private Phone latestModel;
	private List <Phone> phones = new ArrayList<Phone>();

	public PhoneManufacturer(String name) {
		this.name = name;
	}

	public void addPhone(Phone p) {
		phones.add(p);
	}

	public void setLatestModel(Phone p) {
		this.latestModel = p;
		notifyAll(this.name, "latestModel", this.latestModel);
	}
}

/**
 * This class represents a network service provider that updates their clients about the latest phones from various companies.
 */
class NetworkServiceProvider implements Observer {
	private String name;

	public NetworkServiceProvider(String name) {
		this.name = name;
	}

	@Override
	public void handle(PropertyChangedEvent args) {
		System.out.println(this.name + " now supports " + args.newValue + ", " + args.name + "'s latest phone.");
	}
}