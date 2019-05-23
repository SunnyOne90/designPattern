package designPattern.singleton.hungry;

public class HungrySingleton {
    //私有化构造方法
    private HungrySingleton(){}
    //先静态、后动态
    //先属性、后方法
    //先上后下
    private static final HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
       return singleton;
    }
}
