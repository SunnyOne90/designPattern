package designPattern.decorator.old;


public class DecoratorTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService = new SigninForThirdService(new
                SiginService());
        signinForThirdService.loginForQQ("xdcdfswrwsdfssdfqsdf");
    }
}
