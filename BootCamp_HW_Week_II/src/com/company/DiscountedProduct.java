package com.company;

public class DiscountedProduct extends Product{
    private final Product original;

    // Discount in percent (%)
    private final double discount;

    public DiscountedProduct(Product original, double discount) {
        super(original);
        if (original instanceof Buy2Take3Product) {
            throw new IllegalArgumentException("Product can not be discounted, its Buy2Take3");
        }

        this.original = original;
        this.discount = discount;
    }


    public static double getDiscountedPrice(Cart cart) {
        return cart.totalPrice() % 20;
    }

    public static double getDiscountedPrice() {
        return 0;
    }
}
