package designPattern.decorator.old;

public class SigninForThirdService implements ISigninForThirdService{

    //虽然使用了静态代理，不是用于对原有对象功能的增强，而是用于对原有对象的扩展
    private ISiginService iSiginService;

    public SigninForThirdService(ISiginService iSiginService) {
        this.iSiginService = iSiginService;
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return new LoginForQQ().qqLogin(id);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
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
