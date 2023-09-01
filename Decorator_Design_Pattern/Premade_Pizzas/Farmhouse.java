package Decorator_Design_Pattern.Premade_Pizzas;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;

public class Farmhouse extends BasePizza {
    public Farmhouse() {
        name = "Farmhouse";
    }

    public int getCost() {
        return 150;
    }
}
