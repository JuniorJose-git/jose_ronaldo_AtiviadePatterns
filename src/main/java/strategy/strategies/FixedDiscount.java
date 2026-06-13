package strategy.strategies;

import strategy.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {

    double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        return subtotal - amount;
    }
}
