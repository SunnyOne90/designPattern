package designPattern.factory;

public class FerrariCar  implements Car{
    public Car sedanCar() {
        System.out.println("法拉利");
        return new FerrariCar();
    }
}
