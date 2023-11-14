package composite;

public abstract class Component {

	private String name;
	private Double size;
	
	Component(String name, Double size)
	{
		this.name = name;
		this.size = size;
	}
	public String getName(){ return name; }
	
	public void setName(String newName) {	this.name = newName; }

	public Double getSize() { return size; }
	
	public void setSize(Double size) { this.size = size; }
}


