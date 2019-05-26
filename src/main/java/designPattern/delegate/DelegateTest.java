package designPattern.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("卖淫",new Leader());

    }

}
