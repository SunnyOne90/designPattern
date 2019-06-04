package designPattern.decorator.v2;

/**
 * 香肠的包装器
 */
public class SausageDecorator extends BattercakeDecorator{
    //持有被包装的引用
    protected SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
