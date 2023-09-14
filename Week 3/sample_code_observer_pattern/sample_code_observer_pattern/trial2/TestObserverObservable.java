package trial2;


public class TestObserverObservable{
	
	public static void main(String [] args)
	  {
		
		Celebrity A = new Celebrity("Madonna", "Ciccone", 25);
		
		CelebrityObserver msnbc = new CelebrityObserver("MSNBC");
		CelebrityObserver cnn = new CelebrityObserver("CNN");
		CelebrityObserver fox = new CelebrityObserver("FOX");
		
		A.add(msnbc, "firstname");
		A.add(cnn, "firstname");
		A.add(cnn, "age");
		A.add(fox, "all");
		A.setAge(33);
		A.setFirstName("Veronica");
		
		
		
		A.remove(cnn, "firstname");
		
		A.setAge(32);
		A.setFirstName("Madonna");
		A.remove(msnbc, "age");
		A.setAge(44);
		
	  }
}


