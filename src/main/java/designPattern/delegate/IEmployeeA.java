package designPattern.delegate;

/**
 * 员工A所做的事情
 */
public class IEmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
