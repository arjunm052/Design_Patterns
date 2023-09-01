package Factory_Pattern.Shape_Factory;

import Factory_Pattern.Shape.Circle;
import Factory_Pattern.Shape.Rectangle;
import Factory_Pattern.Shape.Shape;
import Factory_Pattern.Shape.Square;

public class ShapeFactory {

    public Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
