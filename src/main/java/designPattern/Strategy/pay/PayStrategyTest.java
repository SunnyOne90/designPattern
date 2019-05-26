package designPattern.Strategy.pay;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","20005646465",600);
        PayState payState =  order.pay(PayStrategy.JD_PAY);
        System.out.println(payState);
    }
}
