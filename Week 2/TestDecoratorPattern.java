package Discussions;

public class TestDecoratorPattern{
    public static void main(String[] args) {
        /*** creating some shapes ***/
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(4, 5);
        System.out.println(cir.getShapeInfo());
        System.out.println(rect.getShapeInfo());
        /*** creating some colored shapes ***/
        ColoredShape cs = new ColoredShape(cir, "blue");
        cir.resize(100);
        ColoredShape cs1 = new ColoredShape(new Circle(2), "red");
        System.out.println(cs.getShapeInfo());
        System.out.println(cs1.getShapeInfo());
        /*** creating some transparent shapes ***/
        TransparentShape ts = new TransparentShape(cir, 15);
        TransparentShape ts1 = new TransparentShape(new Rectangle(5, 9), 35);
        System.out.println(ts.getShapeInfo());
        System.out.println(ts1.getShapeInfo());
        /** todo1: create a 90% transparent blue rectangle **/
        TransparentShape tr1 = new TransparentShape(new ColoredShape(new Rectangle(3, 4), "blue"), 90);
        System.out.println(tr1.getShapeInfo());
        /** todo2: create a red circle with 30% transparency **/
        TransparentShape tc1 = new TransparentShape(new ColoredShape(new Circle(3), "red"), 30);
        System.out.println(tc1.getShapeInfo());
        /**
         * todo3:
         * Predict the output of the following instruction and then execute and check if
         * that matches
         * with your prediction
         * 
         * Prediction:
         * A new shape with 20% transparency, the color purple, and its a circle with radius 3
         */
        Shape tcs = new TransparentShape(new ColoredShape(new Circle(3), "purple"), 20);
        System.out.println(tcs.getShapeInfo());
        Shape tcs2 = new ColoredShape(new TransparentShape(new Rectangle(3, 4), 50), "white");
        /**
         * todo4:
         * Add a new decorator class that can be used to create a shape with different
         * dimensions
         * Example: A 2D Rectangle, A 3D Red Triangle, A 3D Blue 10% transparent
         * Rectangle, etc.
         * Now create two such objects and print their information.
         */
        DimensionShape ds = new DimensionShape(new Rectangle(3, 4), 3);
        System.out.println(ds.getShapeInfo());
        DimensionShape ds1 = new DimensionShape(new ColoredShape(new Circle(25), "blue"), 5);
        System.out.println(ds1.getShapeInfo());
    }
}
