package factorypattern.factorymethod;

import java.util.Scanner;

//import factorypattern.factorymethod.Point.AFactory;



class PointFactory{
	
	public Point deliverAPoint(Character c, double x, double y)
	{
		if (c == 'C')
			return new Point (x, y);
		else if (c == 'P')
			return new Point (x*Math.cos(y), x* Math.sin(y));
		else 
			return null;
		
	}
	
}


class Point
{
	private double x, y;
	
	Point(double x, double y) {
		
		
			this.x = x;
			this.y = y;
	  
	}
	
}
	 



public class DemoFactoryPattern {
	
	public static void main(String args[]) {
		
		/* This class will help you create a point in Cartesian coordinate */
		//Point a = new Point(3.5, 6.7);
		
		/*
		 * What if some user have data in polar coordinate
		 * where the input is two double r and theta
		 * this can be converted to x = r*cos(theta) and y = r * sin(theta) 
		 * 
		 *
		 * in java, we cannot have something like the following:
	 
		 * protected Point(double r, double theta) {
		 *		this.x = r * Math.cos(theta);
		 *		this.y = r * Math.sin(theta);
		 *	}
		 *
		 */
		 /* What if we do the following?	*/
		/*
        Scanner in = new Scanner(System.in); 
        Point p1;
		String type = in.nextLine();
		double val1 = in.nextDouble();
		double val2 = in.nextDouble();
		
		if(type.equals("cartesian"))
		
			p1 = new Point(val1, val2);
		
		else
			p1 = new Point(val1*Math.cos(val2), 
						val2* Math.sin(val2));
		
		*/				
		/* ******
		 * Violates the basic OOP principles
		 * 
		 * ******/
		 // next option: if we have access to the 
		
		Scanner in = new Scanner(System.in); 
        
		String type = in.nextLine();
		double val1 = in.nextDouble();
		double val2 = in.nextDouble();
		
		//also, how to expand for newer types? The third party has to know about a lot of details
		//Point p1 = AFactory.CartesianPointFactory(val1, val2);
		//Point p2 = AFactory.PolarPointFactory(val1, val2);
		
	}
}

