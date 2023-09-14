package trial1;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Observable<Observer> {

	private int age;
	private List<Observer> myObservers;
	
	Celebrity(int age){
		this.age = age;
		myObservers = new ArrayList<Observer>(); 
	}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {
		
		if(this.age == age) return;
		
		this.age = age; 
		notifyAllObservers();
	}
	public void notifyAllObservers() {
		
		for (Observer ob: myObservers)
			ob.handle();
	}
	public void addObserver(Observer observer) {
		myObservers.add(observer);
	}

	public void removeObserver(Observer observer) {
		myObservers.remove(observer);
	}
}
