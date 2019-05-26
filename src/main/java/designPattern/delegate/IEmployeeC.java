package designPattern.delegate;

/**
 * 员工C所做的事情
 */
public class IEmployeeC implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工C，我现在开始干" + command + "工作");
    }
}
