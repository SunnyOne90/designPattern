package designPattern.Strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂策略类
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Payment> paystrategy = new HashMap<>();

    static {
        paystrategy.put(ALI_PAY,new AliPay());
        paystrategy.put(JD_PAY,new JDPay());
        paystrategy.put(UNION_PAY,new UnionPay());
        paystrategy.put(WECHAT_PAY,new WechatPay());
    }

    public static Payment get(String payKey){
        if(!paystrategy.containsKey(payKey)){
            return paystrategy.get(DEFAULT_PAY);
        }
        return paystrategy.get(payKey);
    }
}

