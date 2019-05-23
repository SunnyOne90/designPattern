package designPattern.singleton.Lazy;

import java.io.Serializable;

public class LazySingleton implements Serializable{
    private LazySingleton (){}

    private volatile static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                if(lazySingleton == null){
                    return lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    private Object readResolve(){
        return lazySingleton;
    }

}
