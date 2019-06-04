package designPattern.adapter.loginadapter.v2;

import designPattern.adapter.loginadapter.v1.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
