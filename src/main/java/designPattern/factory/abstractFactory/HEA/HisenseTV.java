package designPattern.factory.abstractFactory.HEA;

//这是海信产品族中的产品 电视机；产品族与具体产品建立一一对应的关系
public class HisenseTV implements ITV {
    public void watchTV() {
        System.out.println("看海信电视");
    }
}
