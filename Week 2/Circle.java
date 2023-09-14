package Discussions;

/*

Copy and paste the following code on your machine, compile and test, then complete the TODOs. 

Reply to this thread with your modified code. 

*/
interface Shape {
    String getShapeInfo();
}

class Circle implements Shape {
    private double radius;
    private String name;

    Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    public void resize(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public String getShapeInfo() {
        return "This is a " + name + " with " + radius + " unit radius";
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String name;

    Rectangle(double width, double height) {
        this.name = "Ractangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeInfo() {
        return "This is a " + name + " with height: " + height + " and width:" + width;
    }
}

/*
 * We may want coloredShapes like: coloredRectangle, coloredCircle, etc...
 * We may want to have transparentRectangle, transparentCircle, etc.
 * We may want to have coloredTransparentRectangle, etc...
 */
// So, we are going to build decorator classes
class ColoredShape implements Shape {
    Shape localShape;
    String color;

    ColoredShape(Shape ls, String color) {
        localShape = ls;
        this.color = color;
    }

    @Override
    public String getShapeInfo() {
        return localShape.getShapeInfo() + " that has " + color + " color";
    }
}

class TransparentShape implements Shape {
    Shape localShape;
    int transparency;

    public TransparentShape(Shape ls, int transparency) {
        localShape = ls;
        this.transparency = transparency;
    }

    public void changeTransparency(int tr) {
        transparency = tr;
    }

    @Override
    public String getShapeInfo() {
        return localShape.getShapeInfo() + " with " + transparency + "% transparency";
    }
}

class DimensionShape implements Shape {
    Shape localShape;
    int dimension;

    public DimensionShape(Shape ls, int dimension) {
        localShape = ls;
        this.dimension = dimension;
    }

    public void changeDimension(int dim) {
        dimension = dim;
    }

    @Override
    public String getShapeInfo() {
        return localShape.getShapeInfo() + " with " + dimension + " dimensions";
    }
}
