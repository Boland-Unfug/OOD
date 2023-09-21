package robot;

public abstract class Robot {

	private String name;
	
	public Robot(String name){
		
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public abstract void showExpertise();
	public abstract String toString(); 
}
