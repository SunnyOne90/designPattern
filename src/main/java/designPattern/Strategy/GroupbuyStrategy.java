package designPattern.Strategy;

/**
 * 具体的促销方式（拼团）
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20 人成团，全团享受团购价");
    }
}
