import Factory.FactoryMethod;
import Singleton.SingletonClass;

public class MainApp {

    public static void main(String[] args){

        SingletonClass.getInstance().test();
        SingletonClass.getInstance().test();
        SingletonClass.getInstance().test();

    }
}
