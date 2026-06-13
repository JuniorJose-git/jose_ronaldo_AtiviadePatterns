package strategy.strategies;

import strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {

    double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        return subtotal * (1 - percent/100);
    }
}
