package Abstract_Factory_Pattern;

import Abstract_Factory_Pattern.Abstract_Factory.FactoryProducer;
import Abstract_Factory_Pattern.Shape_Factory.ShapeFactory;
import Abstract_Factory_Pattern.Shapes.Shape;

public class abstractdesign {
    public static void main(String[] args) {
        FactoryProducer abstractFactory = new FactoryProducer();
        ShapeFactory roundedFactory = abstractFactory.getShapeFactory(true);
        Shape shape = roundedFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
