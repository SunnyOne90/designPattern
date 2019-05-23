package designPattern.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AccessoryFactory accessoryFactory = new AccessoryFactory();
        accessoryFactory.createAodiAccessory().tyre();
        accessoryFactory.createAotuoAccessory().tyre();
    }
}
