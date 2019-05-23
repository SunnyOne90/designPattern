package designPattern.factory.abstractFactory.HEA;

public class Test {
    public static void main(String[] args) {
        HaierFactory factory = new HaierFactory();
        factory.createFrig().refrigeration();
        factory.createTV().watchTV();
    }
}
