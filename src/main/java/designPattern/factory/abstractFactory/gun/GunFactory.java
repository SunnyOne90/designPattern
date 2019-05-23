package designPattern.factory.abstractFactory.gun;

public class GunFactory implements IGunFactory{
    public AK47 createAK47() {
        return new AK47Gun();
    }

    public M416 createM416() {
        return new M416Gun();
    }
}
