package designPattern.factory.fatorymethod;

public class Test {
    public static void main(String[] args) {
        CarFactory factory = new BMWFactory();
        factory.create().sedanCar();
    }
}
