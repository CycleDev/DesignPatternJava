package Singleton;

public class SingletonClass {

    private SingletonClass() {
        System.out.println("Singleton constructor");
    }

    public static class SingletonHolder{
        public static SingletonClass singleton = new SingletonClass();
    }

    public static SingletonClass getInstance(){
        return SingletonHolder.singleton;
    }

    public void test(){
        System.out.println("test singleton");
    }
}
