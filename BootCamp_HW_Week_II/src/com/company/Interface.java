package com.company;

import java.util.List;
import java.util.Scanner;

public class Interface {
    boolean b3p2Check = false;
    boolean discountCheck = false;
    Scanner sc = new Scanner(System.in);
    Cart cart = new Cart();
    private int ch = 0;

    public Interface () {
        menu();
    }

    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit" + "\n");
    }

    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("2. Remorve Product");
        System.out.println("3. Apply Buy3 pay 2");
        System.out.println("4. Apply Discount");
        System.out.println("5. Remove From Cart");
        System.out.println("6. Checkout");
        System.out.println("0. Exit" + "\n");
    }

    public void menu () {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            case 3:
                b3p2();
                storeProductsMenu();
                //getUserInput();
                //innerChoice1();
                break;
            case 4:
                applyDiscount();
                storeProductsMenu();
                //getUserInput();
                //innerChoice1();
                break;
            case 5:
                total();
                break;
            default:

                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> products = new storeProducts().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getId() + "- " +
                            "Product Name: " + prod.getProductName() + "| " +
                            "Price: " + prod.getPrice(cart) + "| " +
                            "Quantity: " + prod.getQuantity() + "|" + "\n"
            );
        }
    }

    private void addProductToCart() {
        System.out.println("Please enter product id for add it to your cart...");
        int id = getUserInput();
        cart.addProductToCartByID(id);
    }
    private void total(){
        cart.totalPrice();
    }

    private void showCart() {
        cart.printCartItems();
        System.out.println("\n");
    }

    private void removeProductFromCart() {
        System.out.println("Please enter id of element which you want to delete: ");
        int id = getUserInput();
        cart.removeProductByID(id);
    }
    private void applyDiscount() {
        if (b3p2Check == false) {
            System.out.println("Discount applied! " + "Now your bill is: " + DiscountedProduct.getDiscountedPrice());
            discountCheck = true;
        }else{
            throw new IllegalArgumentException("You cannot benefit from two promotions.");
            //innerChoice1();
        }
    }
    private void b3p2() {
        System.out.println("Please enter id of element...");
        if (discountCheck == false){
            System.out.println("Please enter id of item you want to applied buy 3 pay 2: ");
            int id = getUserInput();
            for (int i = 0; i < 2 ; i++){
                for ( int j= 0 ; j < 2 ; j++){
                    double newCost = cart.totalPrice() * (0.66) ;
                }
                addProductToCart();
            }
        }
        else{
            throw new IllegalArgumentException("You cannot benefit from two promotions.");
            }

    }
}
