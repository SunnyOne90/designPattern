package designPattern.singleton.threadLocal;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}
    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
