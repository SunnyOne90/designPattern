package designPattern.proxy.dbroute.proxy;

import designPattern.proxy.dbroute.IOrderService;
import designPattern.proxy.dbroute.Order;

import java.text.SimpleDateFormat;

public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {
        return 0;
    }
}
