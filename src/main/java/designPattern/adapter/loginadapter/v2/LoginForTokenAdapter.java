package designPattern.adapter.loginadapter.v2;

import designPattern.adapter.loginadapter.v1.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
