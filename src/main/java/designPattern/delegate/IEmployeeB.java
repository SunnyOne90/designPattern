package designPattern.delegate;

/**
 * 员工B所做的事情
 */
public class IEmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
