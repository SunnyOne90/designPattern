package designPattern.prototype.simple;

public class Client {

    public Prototype startClone(Prototype concreteprototype){
        return concreteprototype.clone();
    }
}
