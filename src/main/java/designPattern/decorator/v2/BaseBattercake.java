package designPattern.decorator.v2;

/**
 * 被装饰者的基础实现
 */
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg(){
        return "煎饼";
    }
    @Override
    public int getPrice(){
        return 5;
    }
}
