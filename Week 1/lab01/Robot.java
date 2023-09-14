/**
 * @author fahmidahamid
 * @author your-name-goes-here
 * @date Aug 25 2021
 * @version 1.1
 * 
 * The Robot class is used to create a Robot object with the following properties:
 *  name, rank, salary, faceMask, bodyColor
 *  
 */


public class Robot implements Comparable<Robot>{

	private String name;
	private int rank;  // the lower the better
	private double salary; //per week
	private boolean faceMask; 
	private String bodyColor;
	
	
	Robot(){
		this.name = "essential worker";
		this.rank = 10; //lowest rank
		this.salary = 1000.00; //lowest possible salary
		this.faceMask = false; //
		this.bodyColor = "yellow";
	}
	
	Robot(Robot r){
		this.name = r.name;
		this.rank = r.rank; 
		this.salary = r.salary; 
		this.faceMask = r.faceMask; 
		this.bodyColor = r.bodyColor;
	}
	
	
	Robot(String[] information){
		this.name = information[0];
		this.rank = Integer.valueOf(information[1]); 
		this.salary = Double.valueOf(information[2]); 
		this.faceMask = Boolean.valueOf(information[3]); 
		this.bodyColor = information[4];
	}
	
	Robot(String name, int rank, double salary, boolean faceMask, String bodyColor)
	{
		this.name = name;
		this.rank = rank;
		this.salary = salary;
		this.faceMask = faceMask;
		this.bodyColor = bodyColor;
		
	}
	
	// add setters and getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public int setRank(int rank) {
		this.rank = rank;
		return rank;
	}

	public double getSalary() {
		return salary;
	}

	public double setSalary(double salary) {
		this.salary = salary;
		return salary;
	}

	public boolean isFaceMask() {
		return faceMask;
	}

	public boolean setFaceMask(boolean faceMask) {
		this.faceMask = faceMask;
		return faceMask;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public String setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
		return bodyColor;
	}
	// add constructor if necessary 
	// add toString() method
	// add flipFaceMask() method
	// add compareTo() method that compares

	@Override
	public String toString() {
		return "Robot [name=" + name + ", rank=" + rank + "]";
	}

	public void flipFaceMask() {
		this.faceMask = !this.faceMask;
	}

	/*
	 * This method compares the rank of two Robot objects.
	 * By using Integer.compare(), we can compare any type by breaking it down into its primitive type, as long as the type is the same.
	 */
	@Override
	public int compareTo(Robot o) {
		return Integer.compare(this.rank, o.rank);
	}

}

