package com.company;

import java.util.ArrayList;
import java.util.List;

class Cart {
    static List<Product> cartItems = new ArrayList<Product>();

    private static void addToCart(Product product) {
        cartItems.add(product);
    }

    public static void addProductToCartByID(int id) {
        Product product = getProductByProductID(id);
        addToCart(product);
    }

    private static Product getProductByProductID(int id) {
        Product product = null;
        List<Product> products = new storeProducts().getProducts();
        for (Product prod : products) {
            if (prod.getId() == id) {
                product = prod;
                break;
            }
        }
        return product;
    }

    public static void removeProductByID(int id) {
        Product prod = getProductByProductID(id);
        cartItems.remove(prod);
    }

    static void printCartItems() {
        for (Product prod : cartItems) {
            System.out.println(prod.getProductName());
        }
    }
    public double totalPrice() {
        double sum = 0.0;
        for (Product p : this.cartItems) {
            sum += p.getPrice(this);
        }
        return sum;
    }

    public static List<Product> getCartItems() {
        return cartItems;
    }

    public static void setCartItems(List<Product> cartItems) {
        Cart.cartItems = cartItems;
    }
}
