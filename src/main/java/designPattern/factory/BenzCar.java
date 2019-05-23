package designPattern.factory;

public class BenzCar implements Car{
    public Car sedanCar() {
        System.out.println("奔驰");
        return new BenzCar();
    }
}


