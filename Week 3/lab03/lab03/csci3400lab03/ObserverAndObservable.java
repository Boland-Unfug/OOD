package csci3400lab03;

/**
 * @author fahmidahamid
 * @author boland unfug
 * @date Sep 09 2020
 * @version 1.1
 */

import java.util.ArrayList;
import java.util.List;

interface Observer{

	public void handle(PropertyChangedEvent args);
}

class PropertyChangedEvent{
	
	public String propertyName;
	public Object newValue;
	
	
	public PropertyChangedEvent(
				String propertyName, Object newValue) {
		
		this.propertyName = propertyName;
		this.newValue = newValue;
	}
	
}


class Observable{ 
	
	private List<Observer> observers;
	
	public Observable(){
		observers = new ArrayList<Observer>();
	}
	
	public void subscribe(Observer newObs)
	{
		observers.add(newObs);
	}
	
	public void unsubscribe(Observer rObs)
	{
		observers.remove(rObs);
	}
	
	public void notifyAll(String propertyName, Object newValue)
	{
		for(Observer o: observers)
			o.handle(new PropertyChangedEvent(propertyName, newValue));
		
	}
}


