package Abstract_Factory_Pattern.Shape_Factory;

import Abstract_Factory_Pattern.Shapes.NonRoundedRectangle;
import Abstract_Factory_Pattern.Shapes.NonRoundedSquare;
import Abstract_Factory_Pattern.Shapes.Shape;

public class NonRoundedShapeFactory extends ShapeFactory {

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "SQUARE":
                return new NonRoundedSquare();
            case "RECTANGLE":
                return new NonRoundedRectangle();
            default:
                return null;
        }
    }

}
