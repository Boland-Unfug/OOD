package trial1;

class CelebrityObserver implements Observer<Celebrity>{

	   private String observerName;
	   private Celebrity p;
	   
	   public CelebrityObserver(String observerName, 
			   Celebrity subject){
	
		  this.observerName = observerName; 
	      this.p = subject;
	      this.p.addObserver(this);
	   }

	   @Override
	   public void handle() {
	      System.out.println( this.observerName + ": "
	      		+ "The age of the person has changed to " 
	    		+ p.getAge() ); 
	   }
	}

