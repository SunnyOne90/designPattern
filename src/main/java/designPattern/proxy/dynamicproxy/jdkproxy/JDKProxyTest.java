package designPattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        JDKMeipo jdkMeipo = new JDKMeipo();
        Object obj = jdkMeipo.getInstance(new Girl());
        Method method = obj.getClass().getMethod("findLove",null);
        method.invoke(obj);
    }
}
