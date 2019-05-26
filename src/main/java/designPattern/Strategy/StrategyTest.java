package designPattern.Strategy;

public class StrategyTest{
    public static void main(String[] args) {
        PromotionActivity promotionActivit = new PromotionActivity(new CashbackStrategy());
        promotionActivit.execute();
    }
}
