package Decorator_Design_Pattern;

import Decorator_Design_Pattern.Base_Pizza.BasePizza;
import Decorator_Design_Pattern.Premade_Pizzas.Margheritta;
import Decorator_Design_Pattern.Toppings.ExtraCheese;
import Decorator_Design_Pattern.Toppings.ExtraMushrooms;

public class design {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraMushrooms(new ExtraCheese(new Margheritta()));
        System.out.println(pizza1.getCost());
    }
}
