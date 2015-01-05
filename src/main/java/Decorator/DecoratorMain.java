package Decorator;

import common.Beverage;
import common.Coffe;
import common.Tea;

public class DecoratorMain {

    public void test(){
        Beverage beverage1 = new Coffe();
        System.out.println(beverage1.getDescription() + ": " + beverage1.cost());

        Beverage beverage2 = new Coffe();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + ": " + beverage2.cost());


        Beverage beverage3 = new Tea();
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + ": " + beverage3.cost());
    }
}
