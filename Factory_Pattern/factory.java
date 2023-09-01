package Factory_Pattern;

import Factory_Pattern.Shape.Shape;
import Factory_Pattern.Shape_Factory.ShapeFactory;

public class factory {
    public static void main(String[] args) {
        Shape shape = new ShapeFactory().getShape("CIRCLE");
        shape.draw();
    }
}
