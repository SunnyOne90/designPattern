package designPattern.decorator.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg{

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
    @Override
    protected String getMsg() {
        return super.getMsg()+"一根香肠";
    }
}
