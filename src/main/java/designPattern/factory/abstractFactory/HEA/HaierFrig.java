package designPattern.factory.abstractFactory.HEA;

import java.io.File;

//这是海尔产品族中的产品 冰箱
public class HaierFrig implements IFrig{

    public void refrigeration() {
        System.out.println("用海尔冰箱");
    }
}
