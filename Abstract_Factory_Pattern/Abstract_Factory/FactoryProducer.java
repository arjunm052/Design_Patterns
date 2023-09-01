package Abstract_Factory_Pattern.Abstract_Factory;

import Abstract_Factory_Pattern.Shape_Factory.NonRoundedShapeFactory;
import Abstract_Factory_Pattern.Shape_Factory.RoundedShapeFactory;
import Abstract_Factory_Pattern.Shape_Factory.ShapeFactory;

public class FactoryProducer {
    public ShapeFactory getShapeFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new NonRoundedShapeFactory();
        }
    }
}
