package designPattern.decorator.v2;

/**
 * 包装器
 */
public abstract class BattercakeDecorator extends Battercake{
    /***
     * 拿到被包装的对象Battercake，对其进行功能增强
     */
    private Battercake battercake;

    protected BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.battercake.getPrice();
    }
}
