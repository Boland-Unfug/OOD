package composite;

public abstract class Component {

	private String name;
	private Double size;
	private int count;
	
	Component(String name, Double size)
	{
		this.name = name;
		this.size = size;
		this.count = 1;
	}
	public String getName(){ return name; }
	
	public void setName(String newName) {	this.name = newName; }

	public Double getSize() { return size; }
	
	public void setSize(Double size) { this.size = size; }

	public int getCount() { return this.count; }

	public void setCount(int count) { this.count = count; }
}


