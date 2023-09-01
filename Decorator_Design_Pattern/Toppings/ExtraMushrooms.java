package Decorator_Design_Pattern.Toppings;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;

public class ExtraMushrooms extends ToppingDecorator {
    public BasePizza basePizza;

    public ExtraMushrooms(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 20;
    }

}
