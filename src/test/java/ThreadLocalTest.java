import designPattern.singleton.threadLocal.ExectorThread;
import designPattern.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        new Thread( new ExectorThread()).start();
        new Thread(new ExectorThread()).start();
    }
}
