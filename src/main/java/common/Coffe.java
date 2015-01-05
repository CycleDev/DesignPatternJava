package common;

public class Coffe extends Beverage {

    public Coffe() {
        description = "Coffee";
    }

    @Override
    public double cost() {
        return 1.85;
    }
}
