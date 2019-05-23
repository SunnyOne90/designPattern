package designPattern.proxy.dbroute.proxy;

public class Test {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(123);
        System.out.println(threadLocal.get());
    }
}
