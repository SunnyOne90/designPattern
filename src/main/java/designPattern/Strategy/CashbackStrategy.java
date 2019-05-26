package designPattern.Strategy;

/**
 * 具体促销的实现方式（返现）
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
