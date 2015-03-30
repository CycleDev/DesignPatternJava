package Adapter;


public class AdapterTest {


    public static void test(){

        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);

        System.out.println("Mallard: ");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("");
        System.out.println("Wild Turkey:");
        duck.quack();
        duck.fly();
    }
}
