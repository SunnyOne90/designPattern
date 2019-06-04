package designPattern.decorator.old;

public class LoginForQQ implements ISiginService {

    public ResultMsg qqLogin(String id){
        return this.regist(id,null);
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
