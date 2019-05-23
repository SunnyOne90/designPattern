package designPattern.proxy.dynamicproxy.jdkproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler{
    private Object obj;
    public Object getInstance(Object target){
        this.obj = target;
        Class<?> clazz = obj.getClass();
       return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before();
        Object obj = method.invoke(this.obj,objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
