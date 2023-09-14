package trial1;

public interface Observable <T>{

	void addObserver(T observer);
	void removeObserver(T observer);
	void notifyAllObservers();
}
