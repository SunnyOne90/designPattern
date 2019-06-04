package designPattern.observer.events;

public class MouseEventTest {
    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            //注册事件,加入监听
            Mouse mouse = new Mouse();
            //@回调方法
            mouse.addLisenter(MouseEventType.ON_CLICK, callback);
            mouse.addLisenter(MouseEventType.ON_MOVE, callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
            mouse.addLisenter(MouseEventType.ON_OVER, callback);
            //调用方法
            mouse.click();//触发事件
            //失焦事件
            mouse.blur();//触发事件
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
