package designPattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * leader是为boss委派的，leader直到自己组内的员工特点
 * 根据特点分配任务
 */
public class Leader implements IEmployee{
    Map<String,IEmployee> iEmployeeMap = new HashMap<>();
    public Leader(){
        iEmployeeMap.put("架构",new IEmployeeA());
        iEmployeeMap.put("业务",new IEmployeeB());
        iEmployeeMap.put("卖淫",new IEmployeeC());
    }


    @Override
    public void doing(String command) {
        iEmployeeMap.get(command).doing(command);
    }
}
