package Decorator_Design_Pattern.Toppings;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    public BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int getCost() {
        return this.basePizza.getCost() + 30;
    }
}
