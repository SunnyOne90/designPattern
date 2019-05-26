package designPattern.proxy.dynamicproxy.cglibProxy;

import designPattern.proxy.Customer;

public class Cglib {
    public static void main(String[] args) {
         Object object = new CglibMeipo().getInstance(Customer.class);
         Customer customer = (Customer)object;
         customer.findLove();
    }
}
