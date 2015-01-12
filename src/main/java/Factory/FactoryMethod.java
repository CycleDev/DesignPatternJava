package Factory;

public class FactoryMethod {

    public static void test(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("nycheese");
        System.out.println("Client 1: " + pizza.getName() + "\n");

        pizza =chicagoStore.orderPizza("chicagocheesse");
        System.out.println("Client 2: " + pizza.getName());

    }
}
