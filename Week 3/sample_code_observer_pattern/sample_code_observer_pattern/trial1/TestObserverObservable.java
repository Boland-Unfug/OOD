package trial1;



public class TestObserverObservable {
	public static void main(String [] args)
	  {
		Celebrity A = new Celebrity(30);
		
		Observer msnbcObserverClientA = new CelebrityObserver("msnbc", A);
		Observer cnnObserverClientA = new CelebrityObserver("cnn", A);
		
		A.setAge(111);
		
		A.setAge(13);
		A.setAge(22);
		A.removeObserver(cnnObserverClientA);
		A.setAge(14);
		A.setAge(14);
		A.addObserver(cnnObserverClientA);
		A.setAge(15);
	  }
}
