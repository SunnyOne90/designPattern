package designPattern.factory.fatorymethod;

import designPattern.factory.BMWCar;
import designPattern.factory.Car;

public class BMWFactory implements CarFactory{
    public Car create() {
        return new BMWCar();
    }
}
