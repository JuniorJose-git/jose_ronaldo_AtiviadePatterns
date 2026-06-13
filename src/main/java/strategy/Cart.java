package strategy;

public class Cart {
    private double subtotal;
    private DiscountStrategy strategy;

    public Cart(double subtotal, DiscountStrategy strategy) {
        this.subtotal = subtotal;
        this.strategy = strategy;
    }

    double total() {
        return strategy.apply(subtotal);
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
}
