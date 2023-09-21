package factorypattern.factorymethod3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DemoFactoryMethodPattern {

	public static void main(String[] args) {
	
		
		List<Shape> shapeList = new ArrayList<Shape>();
		Scanner in = new Scanner(System.in); 
       	
		SimpleShapeFactory spf = new SimpleShapeFactory();
       	
       	String type = in.nextLine();
       	
       	while(!type.equals("NONE"))
       		{
       		Shape n = spf.getShape(type);
       		shapeList.add(n);
       		type = in.nextLine();
       		}
       	
       	for(Shape s: shapeList) 
       		
       		s.draw();

		}
}
