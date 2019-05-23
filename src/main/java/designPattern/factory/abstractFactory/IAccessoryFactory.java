package designPattern.factory.abstractFactory;

public interface IAccessoryFactory{
    //创建奥拓的配件
    Aotuo createAotuoAccessory();
    //创建奥迪的配件
    Aodi createAodiAccessory();
}
