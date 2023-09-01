package Abstract_Factory_Pattern.Shape_Factory;

import Abstract_Factory_Pattern.Shapes.RoundedRectangle;
import Abstract_Factory_Pattern.Shapes.RoundedSquare;
import Abstract_Factory_Pattern.Shapes.Shape;

public class RoundedShapeFactory extends ShapeFactory {

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "SQUARE":
                return new RoundedSquare();
            case "RECTANGLE":
                return new RoundedRectangle();
            default:
                return null;
        }
    }

}
