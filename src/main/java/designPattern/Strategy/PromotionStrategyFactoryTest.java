package designPattern.Strategy;

public class PromotionStrategyFactoryTest {
    public static void main(String[] args) {
        PromotionStrategy promotionStrategy =
                PromotionStrategyFactory.getPromotionStrategy("COUPON");
        promotionStrategy.doPromotion();
    }
}
