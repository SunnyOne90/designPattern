package designPattern.factory.simple;

import designPattern.factory.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory  = new SimpleFactory();
        Car car = factory.getCar("Benz");
        car.sedanCar();
    }
}
