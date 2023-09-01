package Abstract_Factory_Pattern.Shapes;

import Abstract_Factory_Pattern.Shape_Factory.ShapeFactory;

public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Rounded Square");
    }

}
