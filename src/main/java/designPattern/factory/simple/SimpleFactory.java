package designPattern.factory.simple;

import designPattern.factory.BMWCar;
import designPattern.factory.BenzCar;
import designPattern.factory.Car;
import designPattern.factory.FerrariCar;

public class SimpleFactory {
    //简单工厂只需要传递产品名称
    public Car getCar(String name){
        if("BMW".equals(name)){
            return new BMWCar();
        }else if("Benz".equals(name)){
            return new BenzCar();
        }else if("FerrariCar".equals(name)){
            return new FerrariCar();
        }else {
            System.out.println("没有您想要的产品");
            return null;
        }
    }
}
