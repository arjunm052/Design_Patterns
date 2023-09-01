package Abstract_Factory_Pattern.Shape_Factory;

import Abstract_Factory_Pattern.Shapes.Shape;

public abstract class ShapeFactory {
    abstract public Shape getShape(String shape);
}
