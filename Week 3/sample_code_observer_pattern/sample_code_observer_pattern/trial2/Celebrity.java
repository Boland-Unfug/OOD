package trial2;

public class Celebrity extends Observable{
	
	private int age;
	private String firstname;
	private String lastname;
	
	Celebrity(String firstname, String lastname, int age){
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {
		
		if(this.age == age) return;
		this.age = age; 
		this.notifyAll("age", (int) age);
	
		
	 }
	
	public String getFirstName() {return firstname;}
	
	public void setFirstName(String name) {
		
		if(this.firstname.equalsIgnoreCase(name)) return;
		this.firstname = name;
		this.notifyAll("firstname", (String) firstname);
	
		
	 }
	
	
	public String getLastName() {return lastname;}
	
	public void setLastName(String name) {
		
		if(this.lastname.equalsIgnoreCase(name)) return;
		this.lastname = name;
		this.notifyAll("lastname", (String) lastname);
	
		
	 }

}
	
