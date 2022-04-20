package com.company;
import java.util.Objects;

public class Product {
    private int id;
    private String seller;
    private String productName;
    private Integer quantity;
    private double price;

    public Product(int id, String seller, String productName, Integer quantity, double price) {
        this.id = id;
        this.seller = seller;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public Product(Product original) {
        this.seller = original.seller;
        this.productName = original.productName;
        this.price = original.price;
    }

//    public Product(int id, String seller, String productName, String quantity, double price) {
//    }

    public int getId() { return id; }

    public void setId(int id) {this.id = id; }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice(Cart cart) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.productName, other.id)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }
}
