package designPattern.factory.abstractFactory;

public class AccessoryFactory implements IAccessoryFactory {
    public Aotuo createAotuoAccessory() {
        return new AoTuoAccessory();
    }

    public Aodi createAodiAccessory() {
        return new AoDiAccessory();
    }
}
