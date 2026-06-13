package strategy;

import strategy.strategies.FixedDiscount;
import strategy.strategies.NoDiscount;
import strategy.strategies.PercentageDiscount;

public class MainStrategy {
    static void main() {

        DiscountStrategy noDiscount = new NoDiscount();
        Cart carrinho = new Cart(200,noDiscount);

        System.out.println("Total (sem desconto): " + carrinho.total());

        DiscountStrategy percentageDiscount = new PercentageDiscount(10);
        carrinho.setStrategy(percentageDiscount);
        System.out.println("Total (10%): " + carrinho.total());

        DiscountStrategy fixedDiscount = new FixedDiscount(20);
        carrinho.setStrategy(fixedDiscount);
        System.out.println("Total (-20): " + carrinho.total());

    }
}
