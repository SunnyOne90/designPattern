package designPattern.singleton.hungry;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个单例");
        }
    }
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
