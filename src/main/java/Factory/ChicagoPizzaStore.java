package Factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("chicagocheesse")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
