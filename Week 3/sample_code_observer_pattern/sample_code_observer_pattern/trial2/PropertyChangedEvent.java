package trial2;

class PropertyChangedEvent{
	
	public String propertyName;
	public Object newValue;
	
	
	public PropertyChangedEvent( 
				String propertyName, 
				Object newValue) {
		
		this.propertyName = propertyName;
		this.newValue = newValue;
		
	}
	
}
