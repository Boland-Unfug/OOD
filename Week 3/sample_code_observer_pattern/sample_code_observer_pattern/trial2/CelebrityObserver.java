package trial2;


class CelebrityObserver implements Observer{

	   private String observerName;  
	   
	   public CelebrityObserver(String observerName){
		  
		   this.observerName = observerName; 
	      
	   }

	   

	@Override
	public void handle(PropertyChangedEvent p) {
		System.out.println(this.observerName + 
				": The " + p.propertyName +  
				" of the Subject has changed to " + 
				p.newValue); 
		
		}

}
