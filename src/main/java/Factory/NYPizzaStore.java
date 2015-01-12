package Factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("nycheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
