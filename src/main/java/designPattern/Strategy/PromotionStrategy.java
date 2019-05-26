package designPattern.Strategy;

/**
 * 优惠策略会有很多种可能
 * 如：领取优惠券抵扣、返现促销、拼团优惠。下面我们用代码来模拟，首先我们创建一
 * 个促销策略的抽象PromotionStrategy
 */
public interface PromotionStrategy {
    void doPromotion();
}
