package Decorator_Design_Pattern.Premade_Pizzas;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;

public class PeppyPaneer extends BasePizza {
    PeppyPaneer() {
        name = "Peppy Paneer";
    }

    public int getCost() {
        return 200;
    }

}
