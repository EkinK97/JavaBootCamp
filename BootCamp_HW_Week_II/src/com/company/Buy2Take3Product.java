package com.company;

import java.util.List;

public class Buy2Take3Product extends Product {
    private final Product original;


    public Buy2Take3Product(Product original) {
        super(original);
        if (original instanceof DiscountedProduct) {
            throw new IllegalArgumentException("You can not buy and take for a discounted product.");
        }
        this.original = original;
    }


    public double b3p2(Cart cart) {
        long buy2Take3Count = cart.getCartItems().stream().filter(it -> it instanceof Buy2Take3Product).count() / 3;
        if (buy2Take3Count > 0) {
            return this.original.getPrice(cart) * (0.66);
        }
        return this.original.getPrice(cart);
    }
}
