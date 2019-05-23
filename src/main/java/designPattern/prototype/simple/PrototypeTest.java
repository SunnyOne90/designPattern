package designPattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("haha");
        concretePrototype.setHobbies(new ArrayList());
        Client client = new Client();
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA)client.startClone(concretePrototype);
        System.out.println(concretePrototype.getHobbies() == concretePrototypeClone.getHobbies());
    }


}
