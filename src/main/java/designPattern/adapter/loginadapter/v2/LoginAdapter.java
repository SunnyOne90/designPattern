package designPattern.adapter.loginadapter.v2;

import designPattern.adapter.loginadapter.v1.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
