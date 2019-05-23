package designPattern.factory.abstractFactory.HEA;

public class HisenseFactory implements HEAFactory{
    public IFrig createFrig() {
        return new HisenseFrig();
    }

    public ITV createTV() {
        return new HisenseTV();
    }
}
