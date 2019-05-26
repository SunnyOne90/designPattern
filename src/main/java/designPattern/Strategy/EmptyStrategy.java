package designPattern.Strategy;

/**
 * 具体的促销方式（无优惠）
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
