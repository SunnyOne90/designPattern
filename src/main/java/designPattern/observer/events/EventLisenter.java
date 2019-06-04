package designPattern.observer.events;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Observer;

/**
 * 监听器，它就是观察者的桥梁
 */
public class EventLisenter {
    //将触发的事件的信息保存起来;JDK的底层也是这样设计的
    protected Map<String,Event> events = new HashMap<String,Event>();

    //事件名称和一个咪表对象来触发事件
    public void addLisenter(String eventType, Object target){
        try{
            this.addLisenter(
                    eventType,target,
                    target.getClass().getMethod("on"+toUpperFirstCase(eventType),Event.class));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void addLisenter(String eventType, Object target, Method callback) {
        events.put(eventType,new Event(target,callback));
    }

    //触发，只要有动作就触发
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            //发起回调
            if(event.getCallback() != null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){return;}
        trigger(this.events.get(trigger));
    }

    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
