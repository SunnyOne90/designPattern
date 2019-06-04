package designPattern.decorator.v2;

/**
 * 鸡蛋的包装器
 */
public class EggDecorator extends BattercakeDecorator{

    //持有被包装的引用
    protected EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }
}
