package designPattern.factory.abstractFactory.HEA;

//这是海信产品族中的产品 海信冰箱；产品族与具体产品建立一一对应的关系
public class HisenseFrig implements IFrig{
    public void refrigeration() {
        System.out.println("用海信冰箱");
    }
}
