package designPattern.proxy.dynamicproxy.jdkproxy;

import designPattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
//被代理对象
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
