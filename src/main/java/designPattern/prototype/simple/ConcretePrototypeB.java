package designPattern.prototype.simple;

import java.io.*;
import java.util.List;

public class ConcretePrototypeB implements Prototype,Serializable {
    private int age;

    private String name;

    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
//        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
//        concretePrototype.setAge(this.age);
//        concretePrototype.setName(this.name);
//        concretePrototype.setHobbies(this.hobbies);
//        return concretePrototype;
        return (ConcretePrototypeB)deepClone();
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ConcretePrototypeB copy = (ConcretePrototypeB)ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
