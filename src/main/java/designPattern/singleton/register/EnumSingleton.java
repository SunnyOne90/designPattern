package designPattern.singleton.register;

public enum EnumSingleton {
    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
