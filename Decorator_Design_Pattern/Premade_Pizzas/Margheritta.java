package Decorator_Design_Pattern.Premade_Pizzas;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;

public class Margheritta extends BasePizza {

    public Margheritta() {
        name = "Margheritta";
    }

    public int getCost() {
        return 100;
    }
}
