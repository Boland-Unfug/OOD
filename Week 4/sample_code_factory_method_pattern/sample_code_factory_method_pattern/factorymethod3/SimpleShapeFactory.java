package factorypattern.factorymethod3;

public class SimpleShapeFactory extends ShapeFactory{
	
	   
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      else if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
		         return new Triangle();
		         
		     }
	      else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      else
	    	  return null;
	   }
	}
