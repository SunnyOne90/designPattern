package designPattern.factory.fatorymethod;

import designPattern.factory.BenzCar;
import designPattern.factory.Car;

public class BenzFactory implements CarFactory{
    public Car create() {
        return new BenzCar();
    }
}
