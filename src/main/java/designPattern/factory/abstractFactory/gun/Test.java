package designPattern.factory.abstractFactory.gun;

public class Test {
    public static void main(String[] args) {
        GunFactory factory = new GunFactory();
        factory.createAK47().shoot();
    }
}
