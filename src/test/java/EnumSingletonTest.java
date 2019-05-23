import designPattern.singleton.register.EnumSingleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        Object obj = new Object();
        EnumSingleton.INSTANCE.setObject(obj);
        Object obj1 = EnumSingleton.INSTANCE.getObject();
        System.out.println(obj == obj1);
    }
}
