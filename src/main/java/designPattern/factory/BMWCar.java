package designPattern.factory;

public class BMWCar implements Car{
    public Car sedanCar() {
        System.out.println("宝马");
        return new BMWCar();
    }
}
