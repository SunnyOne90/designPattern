package designPattern.singleton.hungry;

public class HungryStaticSingleton {
    private HungryStaticSingleton(){}
    private static final HungryStaticSingleton staticSingleton;

    static {
        staticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return staticSingleton;
    }
}
