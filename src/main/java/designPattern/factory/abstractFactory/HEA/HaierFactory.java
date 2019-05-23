package designPattern.factory.abstractFactory.HEA;
//某个品牌的工厂只负责一种产品族中的产品进行创建
public class HaierFactory implements HEAFactory{

    public IFrig createFrig() {
        return new HaierFrig();
    }

    public ITV createTV() {
        return new HaierTV();
    }
}
